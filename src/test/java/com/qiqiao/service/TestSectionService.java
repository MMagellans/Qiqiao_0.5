package com.qiqiao.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
public class TestSectionService extends TestCase {

	@Autowired
	private SectionService sectionServiceImpl;
	
	@Test
	public void Testaa() {
		sectionServiceImpl.delete(00001L);
	}
}
