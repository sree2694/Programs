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

<title>Registration</title>
</head>
<body>

 <center>
 <div class="text-danger">
  <h1><b>Student App</b></h1>
  </div>
  
  <form action="show" method="get">
  <input type ="submit" value="AllStudents" name="bt" class="btn btn-primary"><br><br>
  
  <div class="form-group">
   Enter Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="num" name="id" class="form-control"><br> <br>
   Enter Name:&nbsp;&nbsp; <input type="text"  name="name" class="form-control"><br> <br> 
   Enter branch:&nbsp; <input type="text" name="branch"class="form-control"><br> <br> 
   Enter Marks:&nbsp;&nbsp;&nbsp; <input type="num" name="marks"class="form-control"><br><br> <br>
    <input type="submit" name ="bt" value="add" class="btn btn-success"> 
     <input type="submit" name ="bt" value="update" class="btn btn-success">
      <input type="submit" name ="bt" value="delete" class="btn btn-success">
  </form>
 </center>
 
</form>
</body>
</html>