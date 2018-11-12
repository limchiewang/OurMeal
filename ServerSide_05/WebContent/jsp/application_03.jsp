<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@page import="java.io.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log 예제</title>
</head>
<body>

<h3>application_02.jsp 의 내용</h3>

<%
	// 웹 컨테이너에 위치한 자원의 경로를 반환받아 사용하는 예제
	String target = "/jsp/application_02.jsp";
	String path = application.getRealPath(target);
	File file = new File(path);
	
	try (BufferedReader br = 
			new BufferedReader(
				new InputStreamReader(
					new FileInputStream(file), "utf-8"))) {
		
		String content = null;
		while( (content = br.readLine()) != null )
			out.println("<p>" + content + "</p>");
		
	} catch(Exception e) {
		;
	}
%>


</body>
</html>





