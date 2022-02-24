package ValidateLoginLogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out= response.getWriter();
	String uname= request.getParameter("username");
	String pass= request.getParameter("password");
	if( uname.equals("VishalN") && pass.equals("admin123") )	
	{
		//create session
		HttpSession session= request.getSession();
		session.setAttribute("user", uname);
		response.sendRedirect("dashboard");
	}
	else
	{
		out.print("Invalid User Details");
	}
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}