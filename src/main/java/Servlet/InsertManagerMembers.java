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

@WebServlet("/InsertManagerMembers")
public class InsertManagerMembers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		boolean isTrue;
		boolean result;
		
		result = ManagerMemberDBUtil.validateManager(username, password);
		
		if (result == true) {
			List<Manager> ManagerDetails = ManagerMemberDBUtil.getAllManagerDetails();
			request.setAttribute("ManagerDetails", ManagerDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Manager Members.jsp");
			dispatcher.forward(request, response);
			
		}else {
		
			isTrue = ManagerMemberDBUtil.insertManager(name, email, phone, username, password);
			
			if(isTrue == true) {
				List<Manager> ManagerDetails = ManagerMemberDBUtil.getAllManagerDetails();
				request.setAttribute("ManagerDetails", ManagerDetails);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("Manager Members.jsp");
				dispatcher.forward(request, response);
			}
			else {
				
				List<Manager> ManagerDetails = ManagerMemberDBUtil.getAllManagerDetails();
				request.setAttribute("ManagerDetails", ManagerDetails);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
				dispatcher.forward(request, response);
			}
		}
	
	}

}
