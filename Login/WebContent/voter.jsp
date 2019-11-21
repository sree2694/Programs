<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name =  request.getParameter("name");
		String age = request.getParameter("age");
	String city = request.getParameter("city"); %>
<table id ="nat">
<tr>
	<td>Full Name</td>
	<td><%= name %></td>
</tr>

<tr>
	<td>Age</td>
	<td><%= age %></td>
</tr>

<tr>
	<td>City</td>
	<td><%= city %></td>
</tr>
</table>
</body>
</html>