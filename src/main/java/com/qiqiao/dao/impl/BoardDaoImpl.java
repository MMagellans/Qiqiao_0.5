package com.qiqiao.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiqiao.dao.BoardDao;
import com.qiqiao.dto.BoardDto;
@Service
public class BoardDaoImpl implements BoardDao {
	
	private final String NAME_SPACE = "com.qiqiao.dao.BoardDtoMapper";
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public int deleteByPrimaryKey(Long id) {
		return sqlsession.delete(NAME_SPACE + ".deleteByPrimaryKey", id);
	}

	@Override
	public int insert(BoardDto record) {
		return sqlsession.insert(NAME_SPACE + ".insert", record);
	}

	@Override
	public int insertSelective(BoardDto record) {
		return sqlsession.insert(NAME_SPACE + ".insertSelective", record);
	}

	@Override
	public BoardDto selectByPrimaryKey(Long id) {
		return sqlsession.selectOne(NAME_SPACE + ".selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(BoardDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(BoardDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKey", record);
	}

}
