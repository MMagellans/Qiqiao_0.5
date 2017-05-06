package com.qiqiao.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.qiqiao.model.User;

public class CheckPrivilegeInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println(request.getRequestURI());
		System.out.println("1"+request.getContextPath());
		System.out.println("2"+request.getRequestURL());
		String contextPath = request.getContextPath();
		StringBuffer sb = request.getRequestURL();
		String requestURL = sb.toString();
		int index = requestURL.indexOf(contextPath);
		if(requestURL==null || index < 0){
			throw new Exception("请求URL异常");			
		}
		String privilegeUrl = requestURL.substring(index+contextPath.length()+1, requestURL.lastIndexOf("."));
		privilegeUrl = privilegeUrl.replace("/", "_");
		System.out.println(privilegeUrl);
		User loginUser = (User)request.getSession().getAttribute("login");				
		// 如果未登录用户
		if (loginUser == null) {			
			if(User.guestHasPrivilegeByUrl(request,privilegeUrl)) {
				System.out.println("没登陆，有权限！");
				return true;
			}else {
				if (privilegeUrl.startsWith("userAction_login")) { // userAction_login, userAction_loginUI
					// 如果是正在使用登录功能，就放行					
					return true;
				} else {
					// 如果不是去登录，就转到登录页面
					System.out.println("没登陆，转入前台登陆页面！");
					response.sendRedirect(request.getContextPath()+"/login.html");
					return false;
				}
			}
		}
		// 如果已登录用户（就判断权限）
		else {
			if (loginUser.hasPrivilegeByUrl(request, privilegeUrl)) {
				// 如果有权限，就放行
				System.out.println("已登陆，有权限！");
				return true;
			} else {
				// 如果没有权限，就转到提示页面
				System.out.println("已登陆，没有权限！");
				return false;
			}
		}
	}

}
