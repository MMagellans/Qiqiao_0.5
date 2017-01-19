/**
 * 
 */
package com.qiqiao.enums;

/**
 * @author Administrator
 * @DATE 2017-1-13
 */
public enum MapperEnum {
	
	Section("com.qiqiao.mapper.SectionMapper");
	
	
	/**
	 * 映射文件路径
	 */
	private String mapperPath;
	
	private MapperEnum(String mapperPath){
		this.mapperPath = mapperPath;
	}
	
	public String getMapperPath(){
		return mapperPath;
	}
}
