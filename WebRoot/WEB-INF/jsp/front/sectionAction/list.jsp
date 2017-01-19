<%@ page import="com.qiqiao.util.StringUtil" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<title><%=application.getAttribute("bbstitle") %>！官方站</title>
		<%@ include file="/WEB-INF/jsp/front/public/public.jspf"%>
	</head>

	<body style="margin-top: 0px;"> 
		<%@ include file="/WEB-INF/jsp/front/public/top.jspf"%>
		<div id="comm_6">
			<a href="forum.html"><div id="path_1"></div></a><!-- 首页 -->
			<div id="path_2"></div>
			<div id="path_3">
				<a href="forum.html" class="a_1" style="line-height: 16px;">论坛</a>
			</div>
			<div>
				${testUser.name }			 
			</div>			
		</div>

		<!-- 分区列表 --> 
		<c:forEach var="section" items="${sectionList}" >
			<div id="index_section">
				<div id="index_sectiontitle">
					<a href="" class="a_1"><span class="index_span2">${section.name}</span></a>
					<img src="${pageContext.request.contextPath}/style/common/images/collapsed_no.gif" title="收起/展开" onclick="closeDiv(this)" style="float: right;margin: 8px 15px;cursor: pointer;" />
				</div>
				<div style="width: 958px; height: auto;">
					<table cellpadding="0" cellspacing="0" class="table_1">
						<thead>
							<tr>
								<td class="td_1" style="height: 30px;">
									&nbsp;
								</td>
								<td class="td_2">
									<span class="span_3">板块</span>
								</td>
								<td class="td_3">
									<span class="span_3">主题</span>
								</td>
								<td class="td_4">
									<span class="span_3">贴数</span>
								</td>
								<td class="td_5" style="padding-left: 15px;">
									<span class="span_3">最后发表</span>
								</td>
							</tr>
						</thead>
						<!-- 板块列表 --> 
						<c:forEach var="board" items="${section.boards}" varStatus="status">
						<tr>
							<td class="td_1">
								<a href="forum-${board.id}.html"><img
									src="${pageContext.request.contextPath}/style/common/images/boardIcon/0${status.index +1 }.png"
									width="40" height="40" style="border:0px;" /></a>
							</td>
							<td class="td_2">
								<div style="height: 25px;">
									<a href="forum-${board.id}.html" class="a_4" style="line-height: 25px;font-weight: bold;color:${board.highColor}">${board.name}</a>
								</div>
								<div style="height: 25px;">
									<span class="span_3" style="color: red;font-weight:normal;">(今日 : ${board.todayArticleCount})</span>									
								</div>
							</td>
							<td class="td_3">
								<span class="span_3">${board.topicCount}</span>
							</td>
							<td class="td_4">
								<span class="span_3">${board.articleCount}</span>
							</td>
							<!-- 最后发表 -->
							<td class="td_5">
								<c:choose>
									<c:when test="${board.lastTopic != null}">
										<a href="topic-${board.lastTopic.id}.html" class="a_0">
											<span class="span_3" style="color: black;">
												
												<c:if test="${fn:length(board.lastTopic.title) >= 15}">
													<c:out value="${fn:substring(board.lastTopic.title,0,15)}"/>...
												</c:if>
												<c:if test="${fn:length(board.lastTopic.title) < 15}">
													<c:out value="${board.lastTopic.title}"/>
												</c:if>
												 
												 
											</span>
										</a>
										<br />
										<span class="span_3" style="line-height: 25px;">by-</span>
										<a href="" class="a_0"><span class="span_3" style="color:#336699;">${board.lastTopic.user.username}</span></a>
										<span class="span_3" style="line-height: 25px;">
											- <fmt:formatDate value="${board.lastTopic.postTime}" type="both" pattern="yyyy/MM/dd HH:mm:ss" /> 
										</span>
									</c:when>
									<c:otherwise>&nbsp;										 
									</c:otherwise>							 
								</c:choose>
							</td>
						</tr>
						</c:forEach>
					</table>
					<!-- 板块列表（结束） -->
				</div>
			</div>
		</c:forEach>
		<!-- 分区列表（结束） -->
		<%@ include file="/WEB-INF/jsp/front/public/buttom.jspf" %>
	</body>
</html>
