<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
<center><h1>Student Details</h1></center>
<table class="table table-striped" border="2" cellspacing="0">
    <thead>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Batch</th>
        <th>Marks</th>
      </tr>
    </thead>
  <c:forEach var="list" items="${sDetails}">
	<tr><td>
		<c:out value="${list.id}"></c:out>&nbsp;&nbsp;&nbsp;</td>
	<td>	<c:out value="${list.name}"></c:out>&nbsp;&nbsp;&nbsp;</td>
		<td><c:out value="${list.batch}"></c:out>&nbsp;&nbsp;&nbsp;</td>
	<td>	<c:out value="${list.marks}"></c:out>&nbsp;&nbsp;&nbsp;</td>
</tr>
	</c:forEach>
</div>
	</table>
</body>
</html>