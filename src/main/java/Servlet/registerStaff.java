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
 * Servlet implementation class registerStaff
 */
@WebServlet("/registerStaff")
public class registerStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerStaff() {
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
			staffModel stfModel = new staffModel();
			
			stfModel.setStaffName(request.getParameter("name"));
			stfModel.setStaffAddress(request.getParameter("address"));
			stfModel.setStaffEmail(request.getParameter("email"));
			stfModel.setStaffGender(request.getParameter("sex"));
			stfModel.setStaffUserName(request.getParameter("user"));
			stfModel.setStaffPassword(request.getParameter("pass"));
					
			staffServices service = new staffServices();		
			
			service.insertData(stfModel);
					
			RequestDispatcher dis = request.getRequestDispatcher("HomePage.jsp");
					
			dis.forward(request, response);
		

	}

}
