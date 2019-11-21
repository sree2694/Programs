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
		Integer counter = (Integer) application.getAttribute("numberOfVists");
		if (counter == null || counter == 0) {
			counter = 1;
		} else {
			counter = counter + 1;
		}
		application.setAttribute("numberOfVists", counter);
	%>
	<h3>
		Total number of hits is :
		<%=counter%>
	</h3>
</body>
</html>