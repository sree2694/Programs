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
int a=5,b=8;
int res =a+b;
out.print("Result : "+res);
%> --%>
<%!
int a =5, b=8;
public int getResult(int a, int b){
	return a+b;
}
%>
Addition is:<%=getResult(a, b) %>
</body>
</html>