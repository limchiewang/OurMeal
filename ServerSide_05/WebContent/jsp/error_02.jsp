<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 발생 페이지</title>
</head>
<body>

<% try { %>

<h3>name 파라메터의 값 확인 : <%=request.getParameter("name").trim()%></h3>

<% } catch(Exception e) { %>

<h3>name 파라메터의 값이 입력되지 않았습니다.</h3>

<% } %>

</body>
</html>