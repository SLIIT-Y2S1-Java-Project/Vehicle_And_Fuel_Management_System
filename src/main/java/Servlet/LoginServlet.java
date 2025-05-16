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
import Model.Fuelsellesdetails;
import Services.ManagerFuelSellesDBUtil;
import Services.Validate;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		boolean logcustomer = Validate.validateCustomer(userName, password);
		boolean logmanager = Validate.validateManager(userName, password);
			

		if (logcustomer == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Login As Admin Successful');");
			out.println("location='login.jsp'");
			out.println("</script>");
			
			
		
		
		RequestDispatcher dis = request.getRequestDispatcher("sunil.jsp");
		dis.forward(request, response);
		}
		else if(logmanager== true){
			out.println("<script type='text/javascript'>");
			out.println("alert('Login As Manager Successful');");
			out.println("location='login.jsp'");
			out.println("</script>");
			
			List<Fuelsellesdetails> fuelsellDetails = ManagerFuelSellesDBUtil.getFuelsell();
			request.setAttribute("fuelsellDetails", fuelsellDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Manager Dashboard.jsp");
			dis.forward(request, response);

		
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='Managerlogin.jsp'");
			out.println("</script>");
		}
		
	}

}
