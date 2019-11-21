<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.*,com.ts.controller.*,com.ts.dao.*,com.ts.dto.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Online Groceries Store</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background-color: white;">
	<form action="" method="">
		<div class="container">
			<br> <br>
			<center>
				<u><h2>Groceries</h2></u>
			</center>
			<br>
			<table class="table" border='0px'>
				<thead>
					<tr>
						<th>ProductName</th>
						<th>Size</th>
						<th>UnitPrice</th>

					</tr>
				</thead>

				<tbody>
					<c:forEach items="${gList}" var="glist">

						<tr>
							<td>${glist.name}</td>
							<td>${glist.size}</td>

							<td>${glist.price}</td>

						</tr>

					</c:forEach>

				</tbody>
			</table>
			<br> <br>
			<button type="button" class="btn btn-primary" style="float: right;">ADD
				ITEMS</button>
		</div>
	</form>
</body>
</html>