<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 
page 디렉티브의 isErrorPage 속성이 true 라면
해당 페이지에서는 exception 기본 객체를 사용할 수 있습니다.
exception 기본 객체는 에러가 발생한 페이지에서 전달된 예외객체가
저장되어 있습니다.
--%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 처리 페이지</title>
</head>
<body>

<% for( int i = 0 ; i < 20 ; i++ ) { %>
<h3>에러 클래스 : <%= exception.getClass().getName() %></h3>
<h4>에러 메세지 : <%= exception.getMessage() %></h4>
<% } %>

</body>
</html>













