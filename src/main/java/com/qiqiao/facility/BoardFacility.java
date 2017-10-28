package com.qiqiao.facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiqiao.dao.TopicDao;

@Service
public class BoardFacility {
	
	@Autowired
	private TopicDao topicDaoImpl;
	
	/**
	 * 查询今日某一板块的文章数（包括主题和回帖）
	 */
	public int todayArticle(Long id){
		
		
		return 0;
	}
}
