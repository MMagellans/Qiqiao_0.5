package com.qiqiao.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiqiao.dao.RoleDao;
import com.qiqiao.dto.RoleDto;
@Service
public class RoleDaoImpl implements RoleDao {
	
	private final String NAME_SPACE = "com.qiqiao.dao.RoleDtoMapper";
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public int deleteByPrimaryKey(Long id) {
		return sqlsession.delete(NAME_SPACE + ".deleteByPrimaryKey", id);
	}

	@Override
	public int insert(RoleDto record) {
		return sqlsession.insert(NAME_SPACE + ".insert", record);
	}

	@Override
	public int insertSelective(RoleDto record) {
		return sqlsession.insert(NAME_SPACE + ".insertSelective", record);
	}

	@Override
	public RoleDto selectByPrimaryKey(Long id) {
		return sqlsession.selectOne(NAME_SPACE + ".selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(RoleDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(RoleDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKey", record);
	}

}
