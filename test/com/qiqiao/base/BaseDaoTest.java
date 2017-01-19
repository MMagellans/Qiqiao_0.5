/**
 * 
 */
package com.qiqiao.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qiqiao.mapper.SectionMapper;
import com.qiqiao.model.Section;
import com.qiqiao.model.User;


/**
 * @author Administrator
 * @DATE 2017-1-4
 */
public class BaseDaoTest {

	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void testBean(){
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ac.getBean("sqlSessionFactory");
		System.out.println(sqlSessionFactory);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
    	
//    	Section section = (Section) sqlSession.selectOne("com.qiqiao.mapper.SectionMapper.selectSectionById", Integer.valueOf("1"));
//      System.out.println(section.toString());
//      System.out.println(section.getBoards().size());
        
        SectionMapper sectionMapper = sqlSession.getMapper(SectionMapper.class);
        Section section2 = sectionMapper.selectSectionById(1);
        System.out.println("section2" + section2.toString());
        System.out.println("section2" + section2.getBoards().size());
        
	}
	
	@Test
	public void testList(){
		User user = new User();
		Set<User> users = new HashSet<User>();
		user.setName("aa");
		users.add(user);
		user.setName("bb");
		users.add(user);
		
		for (User user2 : users) {
			System.out.println(user2.getName());
		}
	}
}
