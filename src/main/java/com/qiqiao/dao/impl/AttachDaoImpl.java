package com.qiqiao.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiqiao.dao.AttachDao;
import com.qiqiao.dto.AttachDto;
@Service
public class AttachDaoImpl implements AttachDao {
	
	private final String NAME_SPACE = "com.qiqiao.dao.AttachDtoMapper";
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public int deleteByPrimaryKey(Long id) {
		return sqlsession.delete(NAME_SPACE + ".deleteByPrimaryKey", id);
	}

	@Override
	public int insert(AttachDto record) {
		return sqlsession.insert(NAME_SPACE + ".insert", record);
	}

	@Override
	public int insertSelective(AttachDto record) {
		return sqlsession.insert(NAME_SPACE + ".insertSelective", record);
	}

	@Override
	public AttachDto selectByPrimaryKey(Long id) {
		return sqlsession.selectOne(NAME_SPACE + ".selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(AttachDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(AttachDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKey", record);
	}

}
