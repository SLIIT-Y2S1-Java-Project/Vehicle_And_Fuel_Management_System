package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Manager;
import Services.ManagerMemberDBUtil;

@WebServlet("/ManagerMembersShowData")
public class ManagerMembersShowData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Manager> ManagerDetails = ManagerMemberDBUtil.getAllManagerDetails();
		request.setAttribute("ManagerDetails", ManagerDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("Manager Members.jsp");
		dis.forward(request, response);

	}

}
