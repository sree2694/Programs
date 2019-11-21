<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<br>
	<br>
	<br>
	<%-- <c:forEach var="list" items="${eDetails}">
		<c:out value="${list.id}"></c:out>&nbsp;&nbsp;&nbsp;
		<c:out value="${list.name}"></c:out>&nbsp;&nbsp;&nbsp;
		<c:out value="${list.sal}"></c:out>&nbsp;&nbsp;&nbsp;
		<br>
	</c:forEach> --%>
	<%-- 
	 <%
		Employee e = (Employee) request.getAttribute("eobj");
		if (e.getId() != 0||e.getName()!=null) {
			out.print(e.getId() + "   " + e.getName() + "   " + e.getSal());
		} else {
			out.print("No Details Found");
		}
	%> --%>
	<c:out value="${eobj.id}"></c:out>
	<br>
	<c:out value="${eobj.name}"></c:out>
	<br>
	<c:out value="${eobj.sal}"></c:out>


</body>
</html>