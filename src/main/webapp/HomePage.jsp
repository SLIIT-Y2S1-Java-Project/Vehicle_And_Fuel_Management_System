<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link rel="stylesheet" href="css/bootstrap.min.css">

<style>
	.div1{
		margin: 10px;
		font-size: 23px;
	}
	body{
		background-color: rgb(178, 170, 170)
	}
	.flex-container{
		display: flex;
		justify-content: space-around;
		align-items: center;
	}
	.flex{
		margin: 100px;
	}
	.a{
		text-decoration: none;
		font-size: 30px;
		color: black;
	}
	.img{
		width:30px;
		height:30px;
	}
	.flex-container2{
		display: flex;
		margin-left:340px;
	}
	.common-div{
		display: flex;
		margin: 60px;
		justify-content: space-around;
	}
	.image{
		width: 250px;
		height: 250px;
		margin-right: 80px;
		border-radius: 10px;
	}
	.container {
	  position: relative;
	  width: 50%;
	}
	
	.image {
	  opacity: 1;
	  display: block;
	  width: 120%; /* Adjust the width percentage as needed */
	  height: auto;
	  transition: .5s ease;
	  backface-visibility: hidden;
	}

	
	.middle {
	  transition: .5s ease;
	  opacity: 0;
	  position: absolute;
	  top: 50%;
	  left: 50%;
	  transform: translate(-50%, -50%);
	  -ms-transform: translate(-50%, -50%);
	  text-align: center;
	}
	
	.container:hover .image {
	  opacity: 0.3;
	}
	
	.container:hover .middle {
	  opacity: 1;
	}
	
	.text {
	  background-color: black;
	  color: white;
	  font-size: 16px;
	  padding: 16px 32px;
	  border-radius: 20px;
	}
	.header5{
		margin-left: 40px;
	}
</style>

</head>
<body>

<div>
	<div class="div1">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="HomePage.jsp"><img src="logo/logo1.avif" style="width:60px; height:60px;"></a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="HomePage.jsp">Home</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="aboutUs.jsp">AboutUs</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="contactUs.jsp">ContactUs</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="bookVehicleService.jsp">Services</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="fuel.jsp">Fuel</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="selectLoginType.jsp">Login</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="selectRegisterType.jsp">Register</a>
		      </li>
		      
		    </ul>
		    <form class="form-inline my-2 my-lg-0">
		    	<div class="flex-container2">
		    		<input type="search" class="form-control mr-sm-2" placeholder="Search">
		      		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		    	</div>
		    </form>
		  </div>
		</nav>
	</div>
</div>

<!-- <a href="adminRegister.jsp"><div class="text">Click</div></a>  -->

<div style="margin-left: 50px; margin-right: 50px;">
	<div class="common-div">
	
		<div class="container">
			<img src="images/service1.jpeg" alt="Avatar" class="image" style="width:100%">
			<div class="middle">
	    	<a href="bookVehicleService.jsp"><div class="text">Click</div></a>
	    
		 	</div>
		</div>
	
		<h5 class="header5">Our web-based VMS simplifies fleet operations by tracking vehicle information, scheduling maintenance, managing drivers, and optimizing routes. Real-time updates and analytics enhance efficiency and cost-effectiveness, ensuring seamless management of your vehicle fleet.</h5>
	</div>
	
	<div class="common-div">
	
		<div class="container">
			<img src="images/service3.png" alt="Avatar" class="image" style="width:100%">
			<div class="middle">
	    	<a href="bookVehicleService.jsp"><div class="text">Click</div></a>
	    
		 	</div>
		</div>
	
		<h5 class="header5">Our FMS for web platforms streamlines fuel usage monitoring, tracks fuel transactions, optimizes refueling schedules, and identifies fuel theft or inefficiencies. Detailed reporting and analysis empower businesses to make data-driven decisions, reduce fuel costs, and improve overall operational performance.</h5>
	</div>
	
	<div class="common-div">
	
		<div class="container">
			<img src="images/service3.jpeg" alt="Avatar" class="image" style="width:100%">
			<div class="middle">
	    	<a href="bookVehicleService.jsp"><div class="text">Click</div></a>
	    
		 	</div>
		</div>
	
		<h5 class="header5">Seamlessly combine our VMS and FMS on the web to gain comprehensive control over your fleet and fuel resources. From vehicle maintenance to fuel consumption tracking, our integrated solution offers real-time insights, cost savings, and operational efficiency enhancements for your business.</h5>
	</div>
	
	<div class="common-div">
	
		<div class="container">
			<img src="images/service4.jpeg" alt="Avatar" class="image" style="width:100%">
			<div class="middle">
	    	<a href="bookVehicleService.jsp"><div class="text">Click</div></a>
	    
		 	</div>
		</div>
	
		<h5 class="header5">Manage your fleet's vehicles and fuel usage effectively with our web-based tracking system. Monitor vehicle locations, fuel consumption, maintenance schedules, and fuel transactions in real time. Our solution helps optimize fleet operations, reduce costs, and improve productivity.

		</h5>
	</div>
</div>

<div style="background-color: gray;">
	<div class="flex-container">
		<a href="bookVehicleService.jsp" class="a"><div class="flex">Services</div></a>
		<a href="aboutUs.jsp" class="a"><div class="flex">About Us</div></a>
		<a href="contactUs.jsp" class="a"><div class="flex">Contact Us</div></a>
		<a href="fuel.jsp" class="a"><div class="flex">Fuel</div></a>
	</div>
</div>

</body>
</html>