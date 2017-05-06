package com.qiqiao.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Mr.Perf  2014-8-21
 *
 */
public class SessionListener implements HttpSessionListener{

	/*session创建事件*/
	public void sessionCreated(HttpSessionEvent event) {
		 ServletContext ctx = event.getSession( ).getServletContext();
		 Integer onlineNumber = (Integer) ctx.getAttribute("onlineNumber") ;
		 onlineNumber++;
		 ctx.setAttribute("onlineNumber", onlineNumber) ;
		 System.out.println("上线 +1！");
		
	}

	/*session销毁事件*/
	public void sessionDestroyed(HttpSessionEvent event) {
		ServletContext ctx  = event.getSession().getServletContext();
		Integer onlineNumber = (Integer) ctx.getAttribute("onlineNumber");
		onlineNumber--;
		ctx.setAttribute("onlineNumber", onlineNumber);
		System.out.println("下线 -1！");
	}

}
