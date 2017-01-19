package com.qiqiao.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * 分区实体
 *
 *
 */
public class Section {
	
	public static final int STATE_NORMAL = 0;//普通状态（默认）
	public static final int STATE_HIDE = 1;//隐藏状态
	public static final int STATE_DELETE = 2;//删除
	
	private Long id;
	private String name;//分区名称
	private String description;//分区描述
	private Date createTime;//分区创建时间
	private int sortNum;//排序号
	private int state;//分区状态
	private Set<User> moderator;//分区版主
	private Set<Board> boards;//分区所包含的板块
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getSortNum() {
		return sortNum;
	}
	public void setSortNum(int sortNum) {
		this.sortNum = sortNum;
	}
	public Set<User> getModerator() {
		return moderator;
	}
	public void setModerator(Set<User> moderator) {
		this.moderator = moderator;
	}
	public Set<Board> getBoards() {
		return boards;
	}
	public void setBoards(Set<Board> boards) {
		this.boards = boards;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	@Override
	public String toString(){
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("id:");
		sBuffer.append(id);
		sBuffer.append("\tname:");
		sBuffer.append(name);
		sBuffer.append("\tdescription:");
		sBuffer.append(description);
		sBuffer.append("\tcreateTime:");
		sBuffer.append(createTime);
		sBuffer.append("\tsortNum:");
		sBuffer.append(sortNum);
		sBuffer.append("\tstate:");
		sBuffer.append(state);
		sBuffer.append("\tboards.seze:");
		sBuffer.append(boards.size());
		
		return sBuffer.toString();
	}
	
}
