package com.qiqiao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.qiqiao.base.BaseController;
import com.qiqiao.model.Board;
import com.qiqiao.model.PageBean;
import com.qiqiao.model.Topic;
import com.qiqiao.util.HqlHelper;

/**
 * 板块
 * @author Administrator
 * @DATE 2016-11-16
 */
@Controller
@RequestMapping(value="/boardAction")
public class BoardController extends BaseController {
	private static final long serialVersionUID = 1L;
	private int flag = 0;
	private Long sid;
	private String sname;
	private String result;
	private String userIds;
	private Long sourcebid;
	private Long objbid;
	/**
	  * 板块主题列表
	  * @return String
	  * @throws
	 */
	@RequestMapping(value="/show")
	public ModelAndView show(@RequestParam("id") Long id) throws Exception{
		//准备数据
		//1，版块信息
		Map<String, Object> model = new HashMap<String, Object>();
		Board board = boardService.getById(id);
		if(board == null) {
			return new ModelAndView("/error/noexist.jsp");
		}
		model.put("board", board);
		//2，今日文章数
		int todayArticleCount = boardService.todayArticle(id);
		//ActionContext.getContext().put("todayArticleCount", todayArticleCount);
		model.put("todayArticleCount", todayArticleCount);
		//3，主题信息列表
		//List<Topic> topicList = topicService.findByBoard(board);
		//准备数据：主题列表（分页信息,使用公共的方法，最终版）
//		List<Topic> testPageList = topicService.getPageBean(1,
//				new HqlHelper(Topic.class, "t")
//				.addCondition("t.board=?", board)
		
//				.addOrder("t.topScope",false)
//				.addOrder("t.lastUpdateTime",false))
//				.getRecordList();
//		for(Topic topic : testPageList) {
//			System.out.println(topic.getTitle());
//		}
		PageBean pageBean = new HqlHelper(Topic.class, "t")
			.addCondition("t.board=?", board)
			.addCondition("t.state=?", 0)
			.addCondition("t.topScope=?", 0)
			.addOrder("t.topScope",false)
			.addOrder("t.lastUpdateTime",false)
			.buildPageBeanForStruts2(pageNum, topicService);
		model.put("pageBean", pageBean);
		//查询置顶主题
		List<Topic> topList = boardService.findTopList(board.getSection().getId(),id);
		model.put("topList", topList);
		return new ModelAndView("/front/boardAction/show.jsp", model);
	}
}
