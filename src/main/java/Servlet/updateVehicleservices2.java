package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.staffModel;
import Model.vehicleServiceModel;
import Services.manageStaffByAdmin;
import Services.vehicleService;

/**
 * Servlet implementation class updateVehicleservices2
 */
@WebServlet("/updateVehicleservices2")
public class updateVehicleservices2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateVehicleservices2() {
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
		
		vehicle.setCustName(request.getParameter("serviceId"));
		vehicle.setCustName(request.getParameter("custName"));
		vehicle.setCustCity(request.getParameter("custCity"));
		vehicle.setCustPhone(request.getParameter("custPhone"));
		vehicle.setCustUserName(request.getParameter("custUserName"));
		vehicle.setCustPassword(request.getParameter("custPassword"));
		vehicle.setServiceType(request.getParameter("serviceType"));
		vehicle.setVehicleBrand(request.getParameter("vehicleBrand"));
		vehicle.setBodyType(request.getParameter("bodyType"));
		vehicle.setManufYear(request.getParameter("manufYear"));
		vehicle.setServiceDescription(request.getParameter("serviceDescription"));
		
		vehicleService service = new vehicleService();
		
		int state = service.updateData(vehicle);
		
		
		if(state > 0){
			request.setAttribute("output2", "Updated Successfully !");
			
		}else {
			request.setAttribute("output2", "Updation Error !");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("loginCustomerToUpdateServices.jsp");
		dis.forward(request, response);
	}

}
