<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@page import="java.util.Enumeration"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log 예제</title>
</head>
<body>

<%
	String logMsg = "로그 메세지 입니다.";
	application.log(logMsg);	
%>

</body>
</html>





