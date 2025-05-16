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



@WebServlet("/InsertManagerFuelOrders")
public class InsertManagerFuelOrders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String orderid = request.getParameter("orderid");
		String type = request.getParameter("type");
		String date = request.getParameter("date");
		String price = request.getParameter("price");
		String phone = request.getParameter("phone");
		String supplier = request.getParameter("supplier");
		
		boolean isTrue;
		boolean result;
		
		result = ManagerFuelOrderDBUtil.validatefuelOrder(orderid);
		
		if (result == true) {
			List<fuelorderdeatails> FuelOrderDetails = ManagerFuelOrderDBUtil.getAllFuelDetails();
			request.setAttribute("FuelOrderDetails", FuelOrderDetails);

			RequestDispatcher dis = request.getRequestDispatcher("ManagerFuelOrders.jsp");
			dis.forward(request, response);
			
		}else {
		
			isTrue = ManagerFuelOrderDBUtil.insertfuelorder(orderid, type, date, price, phone, supplier);
			
			if(isTrue == true) {
				List<fuelorderdeatails> FuelOrderDetails = ManagerFuelOrderDBUtil.getAllFuelDetails();
				request.setAttribute("FuelOrderDetails", FuelOrderDetails);

				RequestDispatcher dis = request.getRequestDispatcher("ManagerFuelOrders.jsp");
				dis.forward(request, response);
			}
			else {
				
				List<fuelorderdeatails> FuelOrderDetails = ManagerFuelOrderDBUtil.getAllFuelDetails();
				request.setAttribute("FuelOrderDetails", FuelOrderDetails);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
				dispatcher.forward(request, response);
			}
		}
	}

}
