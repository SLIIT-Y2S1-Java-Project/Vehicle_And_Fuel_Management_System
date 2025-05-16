package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.fuelorderdeatails;
import Services.ManagerFuelOrderDBUtil;


@WebServlet("/DeleteMangerFueldetails")
public class DeleteMangerFueldetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = ManagerFuelOrderDBUtil.deleteFuelOrder(id);
		
		if (isTrue == true) {
			List<fuelorderdeatails> FuelOrderDetails = ManagerFuelOrderDBUtil.getAllFuelDetails();
			request.setAttribute("FuelOrderDetails", FuelOrderDetails);

			RequestDispatcher dis = request.getRequestDispatcher("ManagerFuelOrders.jsp");
			dis.forward(request, response);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Successful');");
			out.println("location='Manager Members.jsp'");
			out.println("</script>");
		}
		else {
			
			List<fuelorderdeatails> FuelOrderDetails = ManagerFuelOrderDBUtil.getAllFuelDetails();
			request.setAttribute("FuelOrderDetails", FuelOrderDetails);

			RequestDispatcher dis = request.getRequestDispatcher("ManagerFuelOrders.jsp");
			dis.forward(request, response);
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Unuccessful');");
			out.println("location='Manager Members.jsp'");
			out.println("</script>");
		}
		
		
	}

}
