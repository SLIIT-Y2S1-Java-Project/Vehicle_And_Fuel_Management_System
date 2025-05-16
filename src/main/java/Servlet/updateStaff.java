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
 * Servlet implementation class updateStaff
 */
@WebServlet("/updateStaff")
public class updateStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateStaff() {
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

		
		staff.setStaffName(request.getParameter("name"));
		staff.setStaffAddress(request.getParameter("address"));
		staff.setStaffEmail(request.getParameter("sex"));
		staff.setStaffGender(request.getParameter("email"));
		staff.setStaffUserName(request.getParameter("user"));
		staff.setStaffPassword(request.getParameter("pass"));
		
		staffServices service = new staffServices();
		
		ArrayList<String> staffDetails = new ArrayList<>();
		

		ArrayList<String> state = service.showData(staff);
		
		request.setAttribute("output2", "Updated Successfully !");

		RequestDispatcher dis = request.getRequestDispatcher("updateStaff.jsp");

		dis.forward(request, response);

	}

}
