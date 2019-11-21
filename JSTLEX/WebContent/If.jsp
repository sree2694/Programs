<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>If Condition</title>
</head>
<body>
	<!--Setting variable  -->
	<c:set var="num" value="18" scope="page"></c:set>
	<c:if test="${num%2 eq 0}">
		<c:out value="Num is even"></c:out>
	</c:if>
	<c:if test="${num%2 ne 0}">
		<c:out value="Num is not even"></c:out>
	</c:if>
</body>
</html>