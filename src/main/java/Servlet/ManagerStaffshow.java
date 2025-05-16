package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Managerstaff;
import Services.ManagerStaffDBUtil;


@WebServlet("/ManagerStaffshow")
public class ManagerStaffshow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Managerstaff> staffDetails = ManagerStaffDBUtil.getAllstaffDetails();
		request.setAttribute("staffDetails",staffDetails);

		RequestDispatcher dis = request.getRequestDispatcher("ManagerStaffMembers.jsp");
		dis.forward(request, response);
	
	}

}
