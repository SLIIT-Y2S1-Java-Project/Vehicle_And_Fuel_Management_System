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
<%
		String id = request.getParameter("id");
		String orderid = request.getParameter("orderid");
		String type = request.getParameter("type");
		String date = request.getParameter("date");
		String price = request.getParameter("price");
		String phone = request.getParameter("phone");
		String supplier = request.getParameter("supplier");
		
	%>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color:#3C413F">
			<div>
				<a href="#" class="navbar-brand"> User Management Application </a>
			</div>
			<ul class="navbar-nav">
				
			 <form action="back" method="post" class="nav-link">
			 <button class="btn btn-sm btn-outline-secondary me-md-2"style="margin-left: 900px; display: inline-block"> 
			  <span data-feather="add"></span>Home</button>
			 </form>
			</ul>

		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				
				<form action="updatemanagerfuelorder" method="post">
				
				<h2 >Update Fuel Order Details</h2>
				<fieldset class="form-group">
					 
					<input type="hidden" value="<%= id %>" class="form-control" name="id"  >
				</fieldset>

				<fieldset class="form-group">
					<label>Order ID</label> 
					<input type="text" value="<%=orderid %>" class="form-control" name="orderid" required="required" autofocus>
				</fieldset>

				<fieldset class="form-group">
					<label>Order Type</label>
					 <!--  <input type="text" value="<%= type %>" class="form-control"name="type"required> -->
					 <select id="disabledSelect" value="<%= type %>" class="form-control" name="type" required>
					    <option><%= type %></option>
				        <option>Diesel</option>
				        <option>Kerosene</option>
				        <option>Gasoline</option>
				        <option>Biodiesel</option>
				    </select>
				</fieldset>

				<fieldset class="form-group">
					<label>Order Date </label>
					 <input type="text" value="<%= date %>" class="form-control" name="date"required>
				</fieldset>
				
				<fieldset class="form-group">
					<label>Order Price</label>
					 <input type="number" value="<%= price %>" class="form-control" name="price"required>
				</fieldset>
				
				<fieldset class="form-group">
					<label>Phone Number</label>
					 <input  type="tel" name="phone" value="<%= phone %>" class="form-control" placeholder="0785957049" required>
					 <small>Format: 0785957049</small>
				</fieldset>
				<fieldset class="form-group">
					<label>Supplier Name</label> 
					<input  type="text" name="supplier" value="<%= supplier %>" class="form-control"required>
				</fieldset>

				<input type="submit" name="submit" value="Delete Account" style="margin-left:55%;">
				<form action="back" method="post" class="nav-link"> 
					<input type="submit" name="submit" value="Cancel" style="margin-left: 2%;">
          		 </form> 
				</form>
			</div>
		</div>
	</div>
	<br>
</body>
</html>
