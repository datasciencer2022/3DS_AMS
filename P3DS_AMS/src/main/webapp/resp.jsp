<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int num = (int) session.getAttribute("num");
	int resp = (int) session.getAttribute("resp");
	String texto = (String) session.getAttribute("texto");
%>

<html>
<head>
<meta charset="UTF-8">
<title>FATORIAL</title>
</head>
<body>

	
	<center>
		<h1><%= num %>! = <%= texto %> = <%= resp %></h1>
	</center>
</body>
</html>