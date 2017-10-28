package com.qiqiao.dao;

import com.qiqiao.dto.TopicDto;

public interface TopicDao {
    int deleteByPrimaryKey(Long id);

    int insert(TopicDto record);

    int insertSelective(TopicDto record);

    TopicDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TopicDto record);

    int updateByPrimaryKey(TopicDto record);
    
    int getTodayTopicCount(Long bordid);
}