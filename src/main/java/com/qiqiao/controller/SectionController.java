package com.qiqiao.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.qiqiao.base.BaseController;
import com.qiqiao.model.Board;
import com.qiqiao.model.Section;
import com.qiqiao.model.TestUser;
import com.qiqiao.service.SectionService;
import com.qiqiao.util.StringUtil;
/**
 * 分区
 * @author Administrator
 * @DATE 2016-11-3
 */
@Controller
@RequestMapping(value="/sectionAction")
public class SectionController extends BaseController {
	
	private static final long serialVersionUID = 1L; 
	/**
	 * 主页显示分区
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/list")
	public ModelAndView list() throws Exception{
		//准备数据
		//分区信息列表
		List<Section> sectionList = sectionService.findAll();
		
		List<Section> deletedSections = new ArrayList<Section>();
		List<Board> deletedBoards = new ArrayList<Board>();
		// TODO 今日帖数
		for(Section s : sectionList) {
			//如果分区状态为隐藏或删除则移去该分区
			if(s.getState() == Section.STATE_HIDE || s.getState() == Section.STATE_DELETE) {
				//sectionList.remove(s);在执行遍历的时候不能进行remove，否则会抛ConcurrentModificationException异常
				deletedSections.add(s);
			}
			for(Board b : s.getBoards()) {
				if(b.getState() == Board.STATE_HIDE || b.getState() == Board.STATE_DELETE) {//假如该板块是隐藏或删除状态，则不予显示
					//s.getBoards().remove(b);
					deletedBoards.add(b);
				}else {
					b.setTodayArticleCount(boardService.todayArticle(b.getId()));
				}
			}
			s.getBoards().removeAll(deletedBoards);
			deletedBoards.clear();
		}
		sectionList.removeAll(deletedSections);
		
		
		TestUser testUser = new TestUser();
		testUser.setName("qwe");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("sectionList",sectionList);
		modelAndView.addObject("testUser",testUser);
		modelAndView.setViewName("/front/sectionAction/list.jsp");  		
		return modelAndView;
		
	}
}
