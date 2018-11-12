<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@page import="java.util.Enumeration"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>초기화 파라메터 예제</title>
</head>
<body>

<ul>

<%
	Enumeration<String> initParamNames = 
						application.getInitParameterNames();

	while( initParamNames.hasMoreElements() ) {
		
		String initParamName = initParamNames.nextElement();
		String initParamValue = 
				application.getInitParameter(initParamName);
		
		out.println("<li>" + initParamName + 
				" : " + initParamValue + "</li>");
	}
%>

</ul>

</body>
</html>





