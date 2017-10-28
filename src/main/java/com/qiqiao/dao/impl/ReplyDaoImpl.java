package com.qiqiao.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiqiao.dao.ReplyDao;
import com.qiqiao.dto.ReplyDto;
@Service
public class ReplyDaoImpl implements ReplyDao{
	
	private final String NAME_SPACE = "com.qiqiao.dto.ReplyDto";
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public int deleteByPrimaryKey(Long id) {
		return sqlsession.delete(NAME_SPACE + ".deleteByPrimaryKey", id);
	}

	@Override
	public int insert(ReplyDto record) {
		return sqlsession.insert(NAME_SPACE + ".insert", record);
	}

	@Override
	public int insertSelective(ReplyDto record) {
		return sqlsession.insert(NAME_SPACE + ".insertSelective", record);
	}

	@Override
	public ReplyDto selectByPrimaryKey(Long id) {
		return sqlsession.selectOne(NAME_SPACE + ".selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(ReplyDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(ReplyDto record) {
		return sqlsession.update(NAME_SPACE + ".updateByPrimaryKey", record);
	}

}
