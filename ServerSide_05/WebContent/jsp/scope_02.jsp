<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기본 객체를 활용한 영역 테스트(포워딩)</title>
</head>
<body>

<%--
	포워딩 : 현재 웹 컨테이너 존재하는 다른 
	서블릿, jsp로 이동할 수 있는 방법
	(하나의 요청이 종료되지 않고 유지됨)
--%>
<%
	// pageContext 영역은 포워딩 시 데이터가 유효하지 않습니다.
	pageContext.setAttribute("data_pc", 100);

	// request 영역은 포워딩 시 데이터가 사라지지 않습니다.
	// (하나의 요청이 끝나지 않았기 때문에)
	request.setAttribute("data_rq", 200);

	// session 영역은 포워딩 시 데이터가 사라지지 않습니다.
	session.setAttribute("data_ss", 300);

	// application 영역은 포워딩 시 데이터가 사라지지 않습니다.
	application.setAttribute("data_ap", 400);
	
	/*
	RequestDispatcher rd = 
			request.getRequestDispatcher("/jsp/scope_03.jsp");
	rd.include(request, response);
	*/
	
	// pageContext 객체는 forward 및 include 와 같은 기능을
	// 제공하고 있습니다.
	pageContext.forward("/jsp/scope_03.jsp");
	
%>

</body>
</html>






