<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("t1");
		String br = request.getParameter("t2");
		out.print("Name is " + name);
	%>
	<br>
	<%
		out.print("Branch is : " + br);
	%>
</body>
</html>