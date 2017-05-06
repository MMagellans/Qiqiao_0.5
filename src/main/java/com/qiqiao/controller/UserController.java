package com.qiqiao.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qiqiao.base.BaseController;
import com.qiqiao.model.Role;
import com.qiqiao.model.User;


@Controller
@RequestMapping(value = "/userAction")
public class UserController extends BaseController {

	/**
	 * 登录界面
	 * @return
	 */
	@RequestMapping(value="/loginUI")
	public ModelAndView loginUI(){
		return new ModelAndView("/front/userAction/loginUI.jsp");
	}
	
	/**
	 * 登录
	 * @param request
	 * @param username	用户名
	 * @param password	密码
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login")
	public @ResponseBody Map<String, Object> login(HttpServletRequest request,
			@RequestParam("username") String username, @RequestParam("password") String password)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		User user = userService.getByLoginNameAndPassword(username, password);
		if (user == null) {
			map.put("success", false);
			map.put("result", "账号密码有误，请重新输入。");
		} else {
			request.getSession().setAttribute("login", user);
			map.put("success", true);
			map.put("result", "登录成功！");
		}
		return map;		 
	}
	
	/**
	 * 用户注册页面
	 * @return
	 */
	@RequestMapping(value="/registerUI")
	public ModelAndView registerUI(){
		return new ModelAndView("/front/userAction/registerUI.jsp");
	}
	
	/**
	 * 用户注册
	 * @return
	 */
	@RequestMapping(value="/register")
	public ModelAndView register(@RequestParam String username,@RequestParam String password,@RequestParam String email) {
		ModelAndView model = new ModelAndView();
		try {
			User user = new User();
			// 添加新用户，自动注入的属性有：用户名、密码、邮箱
			user.setUsername(username);
			user.setPassword(DigestUtils.md5Hex(password));// 密码需经过加密处理
			user.setEmail(email);
			// 手动注入属性如下：
			user.setTopicCount(0);
			user.setReplyCount(0);
			user.setCredits(0);
			user.setCreateTime(new Date());
			user.setRole(new Role(2L));
			user.setIcon("user_default.gif");
			user.setType(User.USER_NORMAL);
			userService.save(user);
			model.addObject("operationInfo", "注册成功!");
			model.addObject("toWhere","forum.html");
			model.setViewName("/global/forwardUI.jsp");
			return model;
		} catch (Exception e) {
			model.addObject("operationInfo", "注册失败!");
			model.addObject("toWhere","forum.html");
			model.setViewName("/global/forwardUI.jsp");
			return model;
		}
	}
	
	@RequestMapping(value="/logout")
	public @ResponseBody Map<String, Object> logout(HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		request.getSession().removeAttribute("login");
		request.getSession().removeAttribute("admin");
		map.put("success", true);
		map.put("result", "退出登录成功！");
		return map;
	}
}
