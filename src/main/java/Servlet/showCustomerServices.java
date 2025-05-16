package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CustomerModel;
import Model.adminModel;
import Services.adminServices;
import Services.customerSevices;

/**
 * Servlet implementation class showCustomerServices
 */
@WebServlet("/showCustomerServices")
public class showCustomerServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showCustomerServices() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerModel customer = new CustomerModel();
		customerSevices service = new customerSevices();
//		
//		customer.setCustUserName(request.getParameter("user"));
//		customer.setCustPassword(request.getParameter("pass"));
		
		ArrayList<ArrayList<String>> customerDetails = new ArrayList<>();
		
		customerDetails = service.showData(customer);
		
		if(customerDetails != null) {
			request.setAttribute("output", customerDetails);
			RequestDispatcher dis = request.getRequestDispatcher("showCustomerServices.jsp");

			dis.forward(request, response);
		}else if(customerDetails == null) {
			request.setAttribute("output", "Error !");
			RequestDispatcher dis = request.getRequestDispatcher("customerLoggedPage.jsp");
			
			dis.forward(request, response);
		}
		
		
	}

}


