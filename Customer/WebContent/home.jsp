<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar bg-danger">
		<div class="container">
			<img src="abc.jpg" alt="No-image" class="rounded-circle" width="80px"
				height="80px">
			<ul class="nav">
				<li class="nav-item"><button type="button"
						class="btn btn-success" data-toggle="modal" data-target="#myModal">Login</button>&nbsp&nbsp&nbsp
			
				<li class="nav-item"><button type="button"
						class="btn btn-success" data-toggle="modal"
						data-target="#myModal1">SignUp</button>&nbsp&nbsp&nbsp
			</ul>
		</div>

	</nav>

	<div id="myModal" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Login</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>

				</div>
				<div class="modal-body">
					Enter E-mail:<input type="email" name="E-mail" class="form-control"
						style="width: 150px" placeholder="Enter Email"><br>

					Enter password:<input type="password" name="Password"
						class="form-control" style="width: 150px"
						placeholder="Enter password"><br>
				</div>
				<div class="modal-footer">
					<button type="submit">Login</button>
					<input type="checkbox">remember me
				</div>
			</div>

		</div>
	</div>

	<div id="myModal1" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">

				<div class="modal-header">

					<h4 class="modal-title">Sign up</h4>
					<form action="S1" method="post">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<div class="modal-body">
					Enter Name:<input type="text" name="name" class="form-control"
						style="width: 150px" placeholder="Enter name"><br>
					Enter E-mail:<input type="email" name="E-mail" class="form-control"
						style="width: 150px" placeholder="Enter Email"><br>

					Enter password:<input type="password" name="Password"
						class="form-control" style="width: 150px"
						placeholder="Enter password"><br> Enter Phone Number:<input
						type="number" name="phno" class="form-control"
						style="width: 150px" placeholder="Enter Phone number"><br>
					Enter Date of Birth: <input type="date" name="dob"
						class="form-control" style="width: 150px">
				</div>
				<div class="modal-footer">

					<input type="submit" class="btn btn-primary" name="action"
						value="Register" />
					</form>
				</div>
			</div>

		</div>
	</div>
	</form>
</body>
</html>