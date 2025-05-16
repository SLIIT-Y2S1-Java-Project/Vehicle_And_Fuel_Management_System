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

@WebServlet("/UpadateManagerstaff")
public class UpadateManagerstaff extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				String id = request.getParameter("id");
				String name = request.getParameter("name");
				String address = request.getParameter("address");
				String email = request.getParameter("email");
				String gender = request.getParameter("gender");
				String username = request.getParameter("uname");
				String password = request.getParameter("pass");
				
				boolean isTrue;
				
				isTrue = ManagerStaffDBUtil.updatestaff(id, name, address, email, gender, username, password);
				
				if(isTrue == true) {
					

					List<Managerstaff> staffDetails = ManagerStaffDBUtil.getAllstaffDetails();
					request.setAttribute("staffDetails",staffDetails);

					RequestDispatcher dis = request.getRequestDispatcher("ManagerStaffMembers.jsp");
					dis.forward(request, response);
				}
				else {

					List<Managerstaff> staffDetails = ManagerStaffDBUtil.getAllstaffDetails();
					request.setAttribute("staffDetails",staffDetails);

					RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
					dis.forward(request, response);
				}
			
			
				
			}

		

	
	}


