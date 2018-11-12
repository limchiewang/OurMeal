<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기본 객체를 활용한 영역 테스트(포워딩 후 결과 확인)</title>
</head>
<body>

<h3>pageContext 영역의 데이터 확인</h3>
<h3>data_pc : <%= pageContext.getAttribute("data_pc")%></h3>

<h3>request 영역의 데이터 확인</h3>
<h3>data_rq : <%= request.getAttribute("data_rq")%></h3>

<h3>session 영역의 데이터 확인</h3>
<h3>data_ss : <%= session.getAttribute("data_ss")%></h3>

<h3>application 영역의 데이터 확인</h3>
<h3>data_ap : <%= application.getAttribute("data_ap")%></h3>

</body>
</html>






