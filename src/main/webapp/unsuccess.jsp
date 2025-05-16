<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<title>Management Application Unsuccessful</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: #302F2E">
			<div>
				<a href="Manager Dashboard.jsp" class="navbar-brand"> User Management Application </a>
			</div>

			<ul class="navbar-nav">
				<li><a class="nav-link" href="useraccount.jsp"> <span data-feather="log-out" style="margin-right: 10px;"></span>Back Home</a></li> 
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				
			
				<form action="back" method="post">
				
				<h2>Add New Order</h2>

				<fieldset class="form-group" >
					<h3 style="color: red;margin-left: 30%;margin-top:20%;margin-bottom: 20%">Saved Unsuccessful </h3>
				</fieldset>

				

				<input type="submit" name="submit" value="Return Home" style="margin-left: 40%;">
				</form>
			</div>
		</div>
	</div>
</body>
</html>