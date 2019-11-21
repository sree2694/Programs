<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
	<%
ArrayList lt1 = new ArrayList();
lt1.add("Integer");
lt1.add("Double");
lt1.add("Long");
lt1.add("Short");
out.print("size : "+lt1.size());
request.setAttribute("list", lt1);
%>
	List Objects are:
	<c:forEach var="dt" items="${list}">
		<c:out value="${dt}"></c:out>
		<br>
	</c:forEach>
</body>
</html>