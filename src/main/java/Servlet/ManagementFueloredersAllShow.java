package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.fuelorderdeatails;
import Services.ManagerFuelOrderDBUtil;


@WebServlet("/ManagementFueloredersAllShow")
public class ManagementFueloredersAllShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<fuelorderdeatails> FuelOrderDetails = ManagerFuelOrderDBUtil.getAllFuelDetails();
		request.setAttribute("FuelOrderDetails", FuelOrderDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("ManagerFuelOrders.jsp");
		dis.forward(request, response);
	}

}
