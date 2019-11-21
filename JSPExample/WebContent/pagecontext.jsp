<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <%
pageContext.setAttribute("name", "Sree",pageContext.SESSION_SCOPE);//PAGE_SCOPE
String val = (String)pageContext.getAttribute("name",pageContext.SESSION_SCOPE);
out.print("Retrieved values is "+val);
%>
 --%>
	<%
session.setAttribute("fname", "Sree");//PAGE_SCOPE
session.setAttribute("lname", "kanth");//PAGE_SCOPE
session.invalidate();
out.print(session.getAttribute("fname"));
%>
</body>
</html>