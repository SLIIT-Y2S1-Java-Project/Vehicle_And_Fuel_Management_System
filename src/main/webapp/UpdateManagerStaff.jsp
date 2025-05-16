
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
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String price = request.getParameter("price");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
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
				
			
				<form action="managerupdatestaff" method="post">
				
				<h2 >Update Staff Member</h2>
				<fieldset class="form-group">
					 
					<input type="hidden" value="<%= id %>" class="form-control" name="id" >
				</fieldset>

				<fieldset class="form-group">
					<label>Name</label> 
					<input type="text" value="<%=name %>" class="form-control" name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Address</label>
					 <input type="text" value="<%= address %>" class="form-control"name="address"required>
				</fieldset>

				<fieldset class="form-group">
					<label>Email </label>
					 <input type="email" value="<%= email %>" class="form-control" name="email"required>
				</fieldset>
				
				<fieldset class="form-group">
					<label>Gender</label>
					
					<select id="disabledSelect" value="<%=gender%>" class="form-control" name="gender" required>
					    <option><%= gender %></option>
				        <option>Male</option>
				        <option>Female</option>     
				    </select>
				</fieldset>
				
				<fieldset class="form-group">
					<label>UserName</label>
					 <input  type="text" name="uname" value="<%= uname %>" class="form-control"required>
				</fieldset>
				<fieldset class="form-group">
					<label>Password</label> 
					<input  type="Password" name="pass" value="<%= pass %>" class="form-control"required>
				</fieldset>

				<input type="submit" name="submit" value="Update Data" style="margin-left: 58%;">
				
				<form action="back" method="post" class="nav-link">
				 <input type="submit" name="submit" value="Cancel" style="margin-left: 2%;">
				</form>
			</form>
			
			</div>
		</div>
	</div>
</body>
</html>
