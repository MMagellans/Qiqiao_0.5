package com.qiqiao.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiqiao.dao.PrivilegeRoleDao;
import com.qiqiao.dto.PrivilegeRoleDtoKey;
@Service
public class PrivilegeRoleDaoImpl implements PrivilegeRoleDao {
	
	private final String NAME_SPACE = "com.qiqiao.dao.PrivilegeRoleDtoMapper";
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public int deleteByPrimaryKey(PrivilegeRoleDtoKey key) {
		return sqlsession.delete(NAME_SPACE + ".deleteByPrimaryKey", key);
	}

	@Override
	public int insert(PrivilegeRoleDtoKey record) {
		return sqlsession.insert(NAME_SPACE + ".insert", record);
	}

	@Override
	public int insertSelective(PrivilegeRoleDtoKey record) {
		return sqlsession.insert(NAME_SPACE + ".insertSelective", record);
	}

}
