package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.staffModel;
import Services.staffServices;

/**
 * Servlet implementation class showStaff
 */
@WebServlet("/showStaff")
public class showStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showStaff() {
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
		staffModel staff = new staffModel();
		staffServices service = new staffServices();
		
		staff.setStaffUserName(request.getParameter("user"));
		staff.setStaffPassword(request.getParameter("pass"));
		
		ArrayList<String> staffDetails = new ArrayList<>();
		
		staffDetails = service.showData(staff);
		
		if(staffDetails != null) {
			request.setAttribute("output", staffDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("updateStaff.jsp");

			dis.forward(request, response);
		}else if(staffDetails == null) {
			request.setAttribute("output", "Error !");
			
			RequestDispatcher dis = request.getRequestDispatcher("editStaff.jsp");
			
			dis.forward(request, response);
		}
	}

}
