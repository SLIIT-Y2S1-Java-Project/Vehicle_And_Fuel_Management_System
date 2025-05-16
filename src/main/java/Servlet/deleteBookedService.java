package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.adminModel;
import Model.vehicleServiceModel;
import Services.adminServices;
import Services.vehicleService;

/**
 * Servlet implementation class deleteBookedService
 */
@WebServlet("/deleteBookedService")
public class deleteBookedService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteBookedService() {
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
		
		vehicle.setCustUserName(request.getParameter("user"));
		vehicle.setCustPassword(request.getParameter("pass"));

		int state = service.deleteData(vehicle);
		
		if(state > 0) {
			request.setAttribute("output", "Deleted Successfully !");
		}else {
			request.setAttribute("output", "Error detected !");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("customerDeletePage.jsp");
		
		dis.forward(request, response);
	}
		

}
