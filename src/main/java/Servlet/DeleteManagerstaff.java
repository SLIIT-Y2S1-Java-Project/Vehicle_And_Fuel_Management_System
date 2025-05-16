package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Managerstaff;
import Services.ManagerStaffDBUtil;


@WebServlet("/DeleteManagerstaff")
public class DeleteManagerstaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = ManagerStaffDBUtil.deletestaff(id);
		
		if (isTrue == true) {
			List<Managerstaff> staffDetails = ManagerStaffDBUtil.getAllstaffDetails();
			request.setAttribute("staffDetails",staffDetails);

			RequestDispatcher dis = request.getRequestDispatcher("ManagerStaffMembers.jsp");
			dis.forward(request, response);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Successful');");
			out.println("location='Manager Members.jsp'");
			out.println("</script>");
		}
		else {
			
			List<Managerstaff> staffDetails = ManagerStaffDBUtil.getAllstaffDetails();
			request.setAttribute("staffDetails",staffDetails);

			RequestDispatcher dis = request.getRequestDispatcher("ManagerStaffMembers.jsp");
			dis.forward(request, response);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Unuccessful');");
			out.println("location='Manager Members.jsp'");
			out.println("</script>");
		}
		
	}
}