/**
 * 
 */
package com.qiqiao.mapper;

import java.util.List;

import com.qiqiao.model.Section;

/**
 * @author Administrator
 * @DATE 2016-12-27
 */
public interface SectionMapper {
	public Section selectSectionById(int sectionid);
	
	public List<Section> selectSectionAll();
}
