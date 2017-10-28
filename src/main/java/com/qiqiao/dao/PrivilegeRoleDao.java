package com.qiqiao.dao;

import com.qiqiao.dto.PrivilegeRoleDtoKey;

public interface PrivilegeRoleDao {
    int deleteByPrimaryKey(PrivilegeRoleDtoKey key);

    int insert(PrivilegeRoleDtoKey record);

    int insertSelective(PrivilegeRoleDtoKey record);
}