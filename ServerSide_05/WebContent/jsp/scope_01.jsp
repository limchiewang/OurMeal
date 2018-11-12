<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기본 객체를 활용한 영역 테스트</title>
</head>
<body>

<%
	// pageContext 영역은 현재 페이지에서만 유효한
	// 데이터를 저장하고자 하는 경우 사용
	pageContext.setAttribute("data_pc", 100);
%>
<h3>pageContext 영역에 값을 저장</h3>
<h3>data_pc : <%= pageContext.getAttribute("data_pc")%></h3>

<%
	// request 영역은 하나의 요청이 종료될 때까지 사용할 수 있는
	// 데이터를 저장하고자 하는 경우 사용
	request.setAttribute("data_rq", 200);
%>
<h3>request 영역에 값을 저장</h3>
<h3>data_rq : <%= request.getAttribute("data_rq")%></h3>

<%
	// session 영역은 각 클라이언트 마다 할당되는 메모리 영역으로
	// 각 클라이언트가 일정 시간동안 접속하지 않을때까지 사용할 수 있는
	// 데이터를 저장하고자 하는 경우 사용
	session.setAttribute("data_ss", 300);
%>
<h3>session 영역에 값을 저장</h3>
<h3>data_ss : <%= session.getAttribute("data_ss")%></h3>

<%
	// application 영역은 웹 컨테이너에서 하나만 존재하는 영역으로
	// 모든 클라이언트가 공유하고자 하는
	// 데이터를 저장할 때 사용
	application.setAttribute("data_ap", 400);
%>
<h3>application 영역에 값을 저장</h3>
<h3>data_ap : <%= application.getAttribute("data_ap")%></h3>

</body>
</html>






