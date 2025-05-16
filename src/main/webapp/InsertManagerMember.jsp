<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: #3C413F">
			<div>
				<a href="#" class="navbar-brand"> User Management Application </a>
			</div>

			<ul class="navbar-nav">
				
				<form action="back" method="post" class="nav-link">
        
              
                  <button class="btn btn-sm btn-outline-secondary me-md-2"style="margin-left: 900px; display: inline-block">  <span data-feather="add"></span>Home</button>
				</form>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				
			
			<form action="insertmanager" method="post">
				
				<h2>Add New Member</h2>

				<fieldset class="form-group">
					<label>User Name</label> 
					<input type="text" value="" class="form-control" name="name" required="required" autofocus>
				</fieldset>

				<fieldset class="form-group">
					<label>User Email</label> <input type="email" value="" class="form-control"name="email"required>
				</fieldset>

				<fieldset class="form-group">
					<label>Phone Number </label> <input type="tel" value="" class="form-control" name="phone" placeholder="0785957049" required>
					<small>Format: 0785957049</small>
				</fieldset>
				
				<fieldset class="form-group">
					<label>User Name</label> <input type="text" value="" class="form-control" name="uid"required>
				</fieldset>
				
				<fieldset class="form-group">
					<label>Password</label> <input type="password" name="psw" value="" class="form-control"required>
				</fieldset>

				<input type="submit" name="submit" value="Save Data" style="margin-left: 82%;">
			</form>
			</div>
		</div>
	</div>
</body>
</html>