package Servlet;

import java.io.IOException;

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
 * Servlet implementation class loginCustomer
 */
@WebServlet("/loginCustomer")
public class loginCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginCustomer() {
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
			
			customer.setCustUserName(request.getParameter("user"));
			customer.setCustPassword(request.getParameter("pass"));
			
			customerSevices service = new customerSevices();
			
			boolean state = service.validate(customer);
			
			if(state) {
				request.setAttribute("output", "Successfully Logged !");
				RequestDispatcher dis = request.getRequestDispatcher("customerLoggedPage.jsp");
				dis.forward(request, response);
			}else {
				request.setAttribute("output", "Login Failed !");
				RequestDispatcher dis = request.getRequestDispatcher("customerLoginPage.jsp");
				dis.forward(request, response);
			}
			
		}
}
