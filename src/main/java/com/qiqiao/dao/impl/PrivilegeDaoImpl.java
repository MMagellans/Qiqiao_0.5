package com.qiqiao.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiqiao.dao.PrivilegeDao;
import com.qiqiao.dto.PrivilegeDto;
@Service
public class PrivilegeDaoImpl implements PrivilegeDao {
	
	private final String NAME_SPACE = "com.qiqiao.dao.PrivilegeDtoMapper";
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public int deleteByPrimaryKey(Long id) {
		return sqlsession.delete(NAME_SPACE + ".deleteByPrimaryKey", id);
	}

	@Override
	public int insert(PrivilegeDto record) {
		return sqlsession.insert(NAME_SPACE + ".insert", record);
	}

	@Override
	public int insertSelective(PrivilegeDto record) {
		return sqlsession.insert(NAME_SPACE + ".insertSelective", record);
	}

	@Override
	public PrivilegeDto selectByPrimaryKey(Long id) {
		return sqlsession.selectOne(NAME_SPACE + ".selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(PrivilegeDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(PrivilegeDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKey", record);
	}

}
