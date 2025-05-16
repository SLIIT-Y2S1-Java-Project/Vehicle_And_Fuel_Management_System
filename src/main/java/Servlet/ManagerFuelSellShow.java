package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Fuelsellesdetails;
import Services.ManagerFuelSellesDBUtil;


@WebServlet("/ManagerFuelSellShow")
public class ManagerFuelSellShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Fuelsellesdetails> Fuelselles = ManagerFuelSellesDBUtil.getFuelsell();
		request.setAttribute("Fuelselles", Fuelselles);

		RequestDispatcher dis = request.getRequestDispatcher("Manager Dashboard.jsp");
		dis.forward(request, response);
	}

}
