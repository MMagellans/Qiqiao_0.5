package com.qiqiao.dao;

import com.qiqiao.dto.PrivilegeDto;

public interface PrivilegeDao {
    int deleteByPrimaryKey(Long id);

    int insert(PrivilegeDto record);

    int insertSelective(PrivilegeDto record);

    PrivilegeDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrivilegeDto record);

    int updateByPrimaryKey(PrivilegeDto record);
}