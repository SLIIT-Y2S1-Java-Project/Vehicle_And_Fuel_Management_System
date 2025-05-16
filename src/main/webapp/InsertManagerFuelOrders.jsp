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
				
			
				<form action="insertfuelorder" method="post">
				
				<h2>Add New Order</h2>

				<fieldset class="form-group">
					<label>Order ID</label> 
					<input type="text" value="" class="form-control" name="orderid" required="required" autofocus>
				</fieldset>

				<fieldset class="form-group">
					<label>Select Order Fuel Type</label> 
				<!--	<input type="text" value="" class="form-control"name="type"required>-->
					<select id="disabledSelect" class="form-control" name="type" required>
				        <option>Diesel</option>
				        <option>Kerosene</option>
				        <option>Gasoline</option>
				        <option>Biodiesel</option>
				    </select>
				</fieldset>

				<fieldset class="form-group">
					<label>Order Date </label> <input type="date" value="" class="form-control" name="date"required>
				</fieldset>
				
				<fieldset class="form-group">
					<label>Order Price</label> <input type="number" value="" class="form-control" name="price"required>
				</fieldset>
				
				<fieldset class="form-group">
					<label>Phone Number</label> <input  type="tel" name="phone" value="" class="form-control" placeholder="0785957049" required>
					<small>Format: 0785957049</small>
				</fieldset>
				<fieldset class="form-group">
					<label>Supplier Name</label> <input  type="text" name="supplier" value="" class="form-control"required>
				</fieldset>

				<input type="submit" name="submit" value="Save Data" style="margin-left: 82%;">
			</form>
			</div>
		</div>
	</div>
</body>

</html>