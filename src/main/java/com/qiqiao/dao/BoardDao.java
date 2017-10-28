package com.qiqiao.dao;

import com.qiqiao.dto.BoardDto;

public interface BoardDao {
    int deleteByPrimaryKey(Long id);

    int insert(BoardDto record);

    int insertSelective(BoardDto record);

    BoardDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BoardDto record);

    int updateByPrimaryKey(BoardDto record);
}