package com.qiqiao.dao;

import com.qiqiao.dto.UserDto;

public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(UserDto record);

    int insertSelective(UserDto record);

    UserDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDto record);

    int updateByPrimaryKey(UserDto record);
}