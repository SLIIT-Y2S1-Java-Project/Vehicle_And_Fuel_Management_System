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
import Model.staffModel;
import Model.vehicleServiceModel;
import Services.manageStaffByAdmin;
import Services.vehicleService;

/**
 * Servlet implementation class updateVehicleServices
 */
@WebServlet("/updateVehicleServices")
public class updateVehicleServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateVehicleServices() {
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
		
		vehicle.setCustUserName(request.getParameter("user"));

		vehicleService service = new vehicleService();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list = service.showDetails2(vehicle);
		
		if(list == null) {
			request.setAttribute("output", "Enter Valid Username");
			RequestDispatcher dis = request.getRequestDispatcher("loginCustToUpdateOrders.jsp");
			dis.forward(request, response);
		}else {
			request.setAttribute("output", list);
			RequestDispatcher dis = request.getRequestDispatcher("loginCustomerToUpdateServices.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
