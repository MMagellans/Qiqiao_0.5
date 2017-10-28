package com.qiqiao.dao;

import com.qiqiao.dto.SectionDto;

public interface SectionDao {
    int deleteByPrimaryKey(Long id);

    int insert(SectionDto record);

    int insertSelective(SectionDto record);

    SectionDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SectionDto record);

    int updateByPrimaryKey(SectionDto record);
}