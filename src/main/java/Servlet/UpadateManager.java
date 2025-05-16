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

@WebServlet("/UpadateManager")
public class UpadateManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = ManagerMemberDBUtil.updateManager(id, name, email, phone, username, password);
		
		if(isTrue == true) {
			
			List<Manager> ManagerDetails = ManagerMemberDBUtil.getAllManagerDetails();
			request.setAttribute("ManagerDetails", ManagerDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Manager Members.jsp");
			dis.forward(request, response);
		}
		else {
			List<Manager> ManagerDetails = ManagerMemberDBUtil.getAllManagerDetails();
			request.setAttribute("ManagerDetails", ManagerDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Manager Members.jsp");
			dis.forward(request, response);
		}
	}

}
