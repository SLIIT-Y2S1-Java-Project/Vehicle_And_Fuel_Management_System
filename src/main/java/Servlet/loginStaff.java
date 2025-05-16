package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.staffModel;
import Services.staffServices;

/**
 * Servlet implementation class loginStaff
 */
@WebServlet("/loginStaff")
public class loginStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginStaff() {
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
				
				staff.setStaffUserName(request.getParameter("user"));
				staff.setStaffPassword(request.getParameter("pass"));
				
				staffServices service = new staffServices();
				
				boolean state = service.validate(staff);
				
				if(state) {
					request.setAttribute("output", "Successfully Logged !");
					RequestDispatcher dis = request.getRequestDispatcher("staffLoggedPage.jsp");
					dis.forward(request, response);
				}else {
					request.setAttribute("output", "Login Failed !");
					RequestDispatcher dis = request.getRequestDispatcher("staffLogin.jsp");
					dis.forward(request, response);
				}

	}

}
