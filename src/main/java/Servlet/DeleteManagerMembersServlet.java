package Servlet;

import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.Manager;


import Services.ManagerMemberDBUtil;

@WebServlet("/DeleteManagerMembersServlet")
public class DeleteManagerMembersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = ManagerMemberDBUtil.deleteManager(id);
		
		if (isTrue == true) {
			List<Manager> ManagerDetails = ManagerMemberDBUtil.getAllManagerDetails();
			request.setAttribute("ManagerDetails", ManagerDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Manager Members.jsp");
			dispatcher.forward(request, response);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Successful');");
			out.println("location='Manager Members.jsp'");
			out.println("</script>");
		}
		else {
			
			List<Manager> ManagerDetails = ManagerMemberDBUtil.getAllManagerDetails();
			request.setAttribute("ManagerDetails", ManagerDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Manager Members.jsp");
			dispatcher.forward(request, response);
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Unuccessful');");
			out.println("location='Manager Members.jsp'");
			out.println("</script>");
		}
		
	}
	

}
