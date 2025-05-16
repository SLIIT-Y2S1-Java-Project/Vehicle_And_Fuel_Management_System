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
import Model.vehicleServiceModel;
import Services.customerSevices;
import Services.vehicleService;

/**
 * Servlet implementation class showCustomerServiceDetails
 */
@WebServlet("/showCustomerServiceDetails")
public class showCustomerServiceDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showCustomerServiceDetails() {
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
		
		vehicleServiceModel vehicle = new vehicleServiceModel();
		vehicleService service = new vehicleService();
//		
//		customer.setCustUserName(request.getParameter("user"));
//		customer.setCustPassword(request.getParameter("pass"));
		
		ArrayList<ArrayList<String>> vehicleDetails = new ArrayList<>();
		
		vehicleDetails = service.showData(vehicle);
		
		if(vehicleDetails != null) {
			request.setAttribute("output", vehicleDetails);
			RequestDispatcher dis = request.getRequestDispatcher("showVehicleServiceDetails.jsp");
			dis.forward(request, response);
			
		}else if(vehicleDetails == null) {
			request.setAttribute("output", "Error !");
			RequestDispatcher dis = request.getRequestDispatcher("customerLoggedPage.jsp");			
			dis.forward(request, response);
		}
		
	}

}
