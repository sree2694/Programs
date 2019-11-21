<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userObj" class="com.useBean.User"></jsp:useBean>
	<%-- <jsp:setProperty property="uid" name="userObj" />
	<jsp:setProperty property="uname" name="userObj" />
	<jsp:setProperty property="ucity" name="userObj" /> --%>
	<jsp:setProperty property="*" name="userObj" />
	Id is :
	<jsp:setProperty property="uid" name="userObj" /><br>
	Name is :
	<jsp:setProperty property="uname" name="userObj" /><br>
	City is:
	<jsp:setProperty property="ucity" name="userObj" /><br>

</body>
</html>