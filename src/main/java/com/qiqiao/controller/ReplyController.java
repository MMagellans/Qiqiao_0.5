package com.qiqiao.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qiqiao.base.BaseController;
import com.qiqiao.model.Reply;
import com.qiqiao.model.Topic;

/**
 * @author Administrator
 * @DATE 2016-11-23
 */
@Controller
@RequestMapping(value="replyAction")
public class ReplyController extends BaseController {
	/**
	 * 回帖
	 * @return String
	 * @throws
	 */
	@RequestMapping(value="add")
	public ModelAndView add(@RequestParam(value="content") String content) throws Exception {
		//获取回帖的主题
//		Topic topic = topicService.getById(topicId);
//		System.out.println(topicId);
		System.out.println(content);
		//设置属性
		//model.setId(id);
		//model.setContent(content);
//		model.setIpAddr(ServletActionContext.getRequest().getRemoteAddr());
//		model.setPostTime(new Date());
//		model.setState(Reply.STATE_NORMAL);
//		model.setTopic(topic);
//		model.setUser(getCurrentUser());
//		model.setBoardId(topic.getBoard().getId());
//		model.setSectionId(topic.getSection().getId());
//		//存入数据库
//		replyService.save(model);
//		//维护论坛数据（在save方法里实现）
//		return "toTopicShow";
		return null;
	}
}
