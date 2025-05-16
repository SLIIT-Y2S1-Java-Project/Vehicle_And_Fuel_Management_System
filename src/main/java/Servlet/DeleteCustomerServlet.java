package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Customer;
import Services.CustomerDBUtil;




@WebServlet("/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("cusid");
		boolean isTrue;
		
		isTrue = CustomerDBUtil.deleteCustomer(id);
		
		if (isTrue == true) {
			List<Customer> cusDetails = CustomerDBUtil.getAllCustomerDetails();
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Manager Dashboard.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Customer> cusDetails = CustomerDBUtil.getAllCustomerDetails();
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Manager Dashboard.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
