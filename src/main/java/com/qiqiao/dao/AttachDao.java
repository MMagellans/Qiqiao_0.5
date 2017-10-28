package com.qiqiao.dao;

import com.qiqiao.dto.AttachDto;

public interface AttachDao {
    int deleteByPrimaryKey(Long id);

    int insert(AttachDto record);

    int insertSelective(AttachDto record);

    AttachDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AttachDto record);

    int updateByPrimaryKey(AttachDto record);
}