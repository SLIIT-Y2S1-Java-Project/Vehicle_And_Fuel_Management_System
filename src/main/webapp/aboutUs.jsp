<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
		margin-right: 100px;
		border-radius: 40px;
	}
	.container {
	  position: relative;
	  width: 50%;
	}
	
	.image {
	  opacity: 1;
	  display: block;
	  width: 100%;
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
	.class1{
          background-color: rgb(237, 218, 192);
          color: black;
          border-radius: 40px;
          margin: 100px;
          padding: 60px;
          text-align: center;
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
		        <a class="nav-link" href="services.jsp">Services</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="fuel.jsp">Fuel</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="selectLoginType.jsp">Login</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="adminRegister.jsp">Register</a>
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

<div class="class1">
				<h2> About Us </h2>
		    	<h5>
		    		Welcome to our innovative web-based Vehicle Management and Fuel Management System! At [Your Company Name], we specialize in providing comprehensive solutions for managing vehicle fleets and optimizing fuel usage. Our platform is designed to simplify fleet operations, enhance efficiency, and drive cost-effectiveness for businesses of all sizes.

					With our Vehicle Management System (VMS), you can effortlessly track vehicle information, schedule maintenance tasks, manage drivers, and optimize routes. Real-time updates and advanced analytics empower you to make informed decisions, ensuring seamless management of your vehicle fleet.
					
					Our Fuel Management System (FMS) complements the VMS by streamlining fuel usage monitoring, tracking fuel transactions, optimizing refueling schedules, and detecting fuel theft or inefficiencies. Detailed reporting and analysis capabilities enable you to reduce fuel costs, improve fuel efficiency, and enhance overall operational performance.
					
					By integrating our VMS and FMS, you gain comprehensive control over your fleet and fuel resources. Our web-based solution offers centralized management, real-time monitoring, and data-driven insights, allowing you to streamline operations, reduce expenses, and drive business success.
					
					Experience the power of efficient vehicle and fuel management with [Your Company Name]! Join us in revolutionizing how businesses manage their fleets and fuel resources.
		    	</h5>
		    </div>

</body>
</html>