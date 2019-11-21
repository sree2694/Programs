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
if(br.equals("CSE")|| br.equals("mech")){
	
	%>
	
	<jsp:forward page="home.jsp"/>
	<%-- <jsp:param value="12" name="age"/>
	<jsp:param value="hyd" name="cty"/>
	</jsp:forward> --%>
	<%
}
else{
	out.print("only CSE and MECH are eligible");
	%>
	<%-- <jsp:include page="Student.html"/> --%>
	<%@include file ="Student.html" %>
	<%
	}
	%>

</body>
</html>