package com.qiqiao.dao;

import com.qiqiao.dto.ReplyDto;

public interface ReplyDao {
    int deleteByPrimaryKey(Long id);

    int insert(ReplyDto record);

    int insertSelective(ReplyDto record);

    ReplyDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReplyDto record);

    int updateByPrimaryKey(ReplyDto record);
}