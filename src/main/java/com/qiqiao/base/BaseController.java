package com.qiqiao.base;

import javax.annotation.Resource;

import com.qiqiao.service.AttachService;
import com.qiqiao.service.BoardService;
import com.qiqiao.service.PrivilegeService;
import com.qiqiao.service.ReplyService;
import com.qiqiao.service.RoleService;
import com.qiqiao.service.SectionService;
import com.qiqiao.service.TopicService;
import com.qiqiao.service.UserService;

public class BaseController {
	private static final long serialVersionUID = 1L;
	
	@Resource
	protected SectionService sectionService;	
	@Resource
	protected BoardService boardService;	
	@Resource
	protected TopicService topicService;	
	@Resource
	protected ReplyService replyService;	
	@Resource
	protected AttachService attachService;	
	@Resource
	protected UserService userService;	
	@Resource
	protected RoleService roleService;	
	@Resource
	protected PrivilegeService privilegeService;
	
	protected int pageNum = 1;
	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
}
