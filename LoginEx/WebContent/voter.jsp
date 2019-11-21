<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>You are eligible for Vote</h1>
Name:<%=session.getAttribute("n") %>
Age:<%=session.getAttribute("a") %>
City:<%=session.getAttribute("c") %>
</body>
</html>