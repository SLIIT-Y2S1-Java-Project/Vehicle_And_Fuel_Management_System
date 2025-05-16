<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
  <head>
  	<meta charset="ISO-8859-1">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
  
   <title>Manager Member Page</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/dashboard.css" rel="stylesheet">
    <style>
  .backbut{border: none; padding: 0px 0px; border-radius:none;display:inline-block;background-color: none;
  }
</style>
  </head>

  <body>
    <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
      <a class="navbar-brand col-sm-3 col-md-2 mr-0 w-10" href="#" >  Vehicle And Fuel Management System</a>
      <input class="form-control form-control-dark w-50" type="text" placeholder="Search" aria-label="Search"  style="margin-left: 10px;">
      <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
          <a class="nav-link" href="Managerlogin.jsp"> <span data-feather="log-out" style="margin-right: 10px;"></span>Sign out</a>
        </li>
      </ul>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
          <div class="sidebar-sticky">
            <ul class="nav flex-column">
              <li class="nav-item">
                <form action="back" method="post" class="nav-link">
        
                  <span data-feather="home" style="display:inline-block;order-radius:none"></span>
                  <button class="nav-link backbut" >Dashboard </button>
              
               </form>
              </li>
            <li class="nav-item">
                <a class="nav-link  active" href="#">
                  <span data-feather="trello"></span>
                  Fuel Order Details 
                  <span class="sr-only">(current)</span>
                </a>
              </li>
              <li class="nav-item">
                <form action="managers" method="post" class="nav-link">
                
                  <span data-feather="users" style="display:inline-block;order-radius:none"></span>
                  <button class="nav-link backbut" > Managers </button>
               
               </form>
              </li>
              <li class="nav-item">
                 <form action="staff" method="post" class="nav-link">
                
                  <span data-feather="users" style="display:inline-block;order-radius:none"></span>
                  <button class="nav-link backbut" > Staff Members </button>
               
               </form>
              </li>
               <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="users"></span>
                   Customers
                </a>
              </li>
              
               <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="shopping-cart"></span>
                  Services
                </a>
              </li>
              
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="bar-chart-2"></span>
                  Reports
                </a>
              </li>
             
            </ul>

            <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
              <span>Saved reports</span>
              <a class="d-flex align-items-center text-muted" href="#">
                <span data-feather="plus-circle"></span>
              </a>
            </h6>
            <ul class="nav flex-column mb-2">
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Current month
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Last quarter
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Social engagement
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Year-end sale
                </a>
              </li>
            </ul>
          </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4" style="margin-left:200px;">
          <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
            <h1 class="h2">Manager Dashboard</h1>
            <div class="btn-toolbar mb-2 mb-md-0">
              <div class="btn-group mr-2">
                <button class="btn btn-sm btn-outline-secondary">Share</button>
                <button class="btn btn-sm btn-outline-secondary">Export</button>
              </div>
                <button class="btn btn-sm btn-outline-secondary dropdown-toggle">
                <span data-feather="calendar"></span>
                This week
              </button>
            </div>
          </div>

          <h2 style="display: inline-block">Fuel Orders</h2>
          <a href="InsertManagerFuelOrders.jsp"><button class="btn btn-sm btn-outline-secondary me-md-2"style="margin-left: 93%; display: inline-block">  <span data-feather="add"></span> ADD</button> </a>
          <div class="table-responsive">
            <table class="table table-striped table-sm">
              <thead>
                <tr>
       
                  <th>Order ID</th>
                  <th>OrderType</th>
                  <th>OrderDate</th>
                  <th>OrderPrice</th>
                  <th>Phone</th>
                  <th>Supplier</th>
                  <th>Update</th>
                  <th>Delete</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach var="cus" items="${FuelOrderDetails}">
					<c:set var="id" value="${cus.id}"/>
					<c:set var="orderid" value="${cus.orderid}"/>
					<c:set var="type" value="${cus.type}"/>
					<c:set var="date" value="${cus.date}"/>
					<c:set var="price" value="${cus.price}"/>
					<c:set var="phone" value="${cus.phone}"/>
					<c:set var="supplier" value="${cus.supplier}"/>
		            <tr>

				<td>${cus.orderid}</td>
				<td>${cus.type}</td>
				<td>${cus.date}</td>
				<td>${cus.price}</td>
				<td>${cus.phone}</td>
				<td>${cus.supplier}</td>
				<td>
				<c:url value="UpdateManagerFuelOrderDetails.jsp" var="fuelorderupdate">
				<c:param name="id" value="${id}"/>
				<c:param name="orderid" value="${orderid}"/>
				<c:param name="type" value="${type}"/>
				<c:param name="date" value="${date}"/>
				<c:param name="price" value="${price}"/>
				<c:param name="phone" value="${phone}"/>
				<c:param name="supplier" value="${supplier}"/>
				</c:url><a href="${fuelorderupdate}">	<input type="button" name="update" value="Update"></a>
				</td>
				<td>
				<c:url value="ManagerDeleteFuelOrderDetails.jsp" var="fuelorderdelete">
				<c:param name="id" value="${id}"/>
				<c:param name="orderid" value="${orderid}"/>
				<c:param name="type" value="${type}"/>
				<c:param name="date" value="${date}"/>
				<c:param name="price" value="${price}"/>
				<c:param name="phone" value="${phone}"/>
				<c:param name="supplier" value="${supplier}"/>
				</c:url><a href="${fuelorderdelete}">	<input type="button" name="delete" value="Delete"></a>
				</td>
				 </tr>
                </c:forEach>
              </tbody>
            </table>
          </div>
        </main>
      </div>
    </div>

    <!-- Icons -->
    <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
    <script> feather.replace() </script>

  </body>
</html>
