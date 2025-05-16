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


@WebServlet("/CustomerInsert")
public class CustomerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		boolean isTrue;
		boolean result;
		
		result = CustomerDBUtil.validateCustomer(username, password);
		
		if (result == true) {
			List<Customer> cusDetails = CustomerDBUtil.getAllCustomerDetails();
			request.setAttribute("cusDetails", cusDetails);
			RequestDispatcher dis = request.getRequestDispatcher("Manager Dashboard.jsp");
			dis.forward(request, response);
			
		}else {
		
			isTrue = CustomerDBUtil.insertcustomer(name, email, phone, username, password);
			
			if(isTrue == true) {
				List<Customer> cusDetails = CustomerDBUtil.getAllCustomerDetails();
				request.setAttribute("cusDetails", cusDetails);
				RequestDispatcher dis = request.getRequestDispatcher("Manager Dashboard.jsp");
				dis.forward(request, response);
			}
			else {
				List<Customer> cusDetails = CustomerDBUtil.getAllCustomerDetails();
				request.setAttribute("cusDetails", cusDetails);
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
		}
		 
		
		
	}

}
