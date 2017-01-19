package com.qiqiao.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qiqiao.base.BaseController;
import com.qiqiao.model.PageBean;
import com.qiqiao.model.Reply;
import com.qiqiao.model.Topic;
import com.qiqiao.util.HqlHelper;

/**
 * @author Administrator
 * @DATE 2016-11-22
 */
@Controller
@RequestMapping(value="topicAction")
public class TopicController extends BaseController{
	/**
	  * 显示单个主题，回帖列表 
	  * @return String
	  * @throws
	 */
	@RequestMapping(value="show")
	public ModelAndView show(@RequestParam(value="id") long id) {
		try{
			//准备数据
			//1,主题信息
			Map<String, Object> model = new HashMap<String, Object>();
			Topic topic = topicService.getById(id);
			topic.setVisits(topic.getVisits() + 1);
			topicService.update(topic);
			model.put("topic", topic);
			//2,回帖列表
			//List<Reply> replyList = replyService.findByTopic(topic);
			//ActionContext.getContext().put("replyList", replyList);
			PageBean pageBean = new HqlHelper(Reply.class, "r")
				.addCondition("r.topic=?", topic)
				.addOrder("r.postTime",true)
				.buildPageBeanForStruts2(pageNum, topicService);
			model.put("pageBean", pageBean);
			return new ModelAndView("/front/topicAction/show.jsp", model);			
		}catch (Exception e) {
			e.printStackTrace();
//			return "exception";
			//TODO 异常页
			return new ModelAndView("", null);
		}
	}
}
