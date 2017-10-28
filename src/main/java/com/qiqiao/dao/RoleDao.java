package com.qiqiao.dao;

import com.qiqiao.dto.RoleDto;

public interface RoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(RoleDto record);

    int insertSelective(RoleDto record);

    RoleDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleDto record);

    int updateByPrimaryKey(RoleDto record);
}