<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--Setting variable  -->
	<c:set var="str1" value="Employee" />

	<c:if test="${empty str1}">
		<c:out value="${'String is Empty'}"></c:out>
	</c:if>

	<c:if test="${not empty str1}">
		<c:out value="${'String is Not Empty'}"></c:out>
	</c:if>

</body>
</html>