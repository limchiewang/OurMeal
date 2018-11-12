<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>

<h2>메인 페이지의 내용1 입니다.</h2>

<%--
	include 기능을 활용한 페이지의 재사용 방법
	다른 페이지로 이동하여 이동한 페이지에서 처리가 완료되는
	forward 와는 다르게 다른 페이지로 이동한 후, 해당 페이지의
	처리가 종료되면 다시 되돌아와 나무지 내용을 수행할 수 있는 기능
	
	하나의 JSP 화면에서 각 화면의 부분을 모듈화하여 처리하고자 하는
	경우 활용되는 문법
	
	1. 서블릿 내에서 활용되는 RequestDispatcher 클래스를 활용하는 방법
	2. pageContext 기본 객체를 활용한 include 처리 방법 
	3. jsp의 액션태그를 활용한 include 처리 방법 
--%>
<%
	// 1. RequestDispatcher를 활용한 include 처리
	/*
	RequestDispatcher rd = 
				request.getRequestDispatcher("/jsp/include_sub.jsp");
	rd.include(request, response);
	*/
	
	// 2. pageContext 기본 객체를 활용한 include 처리 방법 
	pageContext.include("/jsp/include_sub.jsp");
%>

<%-- 3. jsp의 액션태그를 활용한 include 처리 방법 
<jsp:include page="/jsp/include_sub.jsp"></jsp:include>
--%>

<h2>메인 페이지의 내용2 입니다.</h2>

</body>
</html>








