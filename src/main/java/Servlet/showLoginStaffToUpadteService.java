package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.vehicleServiceModel;
import Services.vehicleService;

/**
 * Servlet implementation class showLoginStaffToUpadteService
 */
@WebServlet("/showLoginStaffToUpadteService")
public class showLoginStaffToUpadteService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showLoginStaffToUpadteService() {
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
	    
	    ArrayList<ArrayList<String>> vehicleDetails = service.showData(vehicle);
	    
	    request.setAttribute("output", vehicleDetails);
		request.setAttribute("len", vehicleDetails.size());

	    RequestDispatcher dis = request.getRequestDispatcher("updateServiceByStaff.jsp");
	    dis.forward(request, response);

	}

}
