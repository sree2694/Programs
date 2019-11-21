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
	<c:set var="num" value="19" scope="page"></c:set>
	<c:if test="${num ge 18}">
		<c:out value="Vote is eligible"></c:out>
	</c:if>
	<c:if test="${num lt 18}">
		<c:out value="Vote is not eligible"></c:out>
	</c:if>

</body>
</html>