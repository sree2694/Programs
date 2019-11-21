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
	<c:out value="Hello Welcome First JSTL"></c:out>
	<br>
	<c:out value="${'Hello'}"></c:out>
	<br> Printing Numbers:
	<c:forEach var="i" begin="1" end="10" step="2" varStatus="st">
		<c:out value="${i}"></c:out>
		<br>
	<%-- count:<c:out value="${st.count }"></c:out>
		<br>
		Index:<c:out value="${st.index }"></c:out>
		<br> --%>
		
		Print first element:
		<c:out value="${st.first }"></c:out>
		<br>
		
		Print Last element:
		<c:out value="${st.last }"></c:out>
		<br>
	</c:forEach>
</body>
</html>