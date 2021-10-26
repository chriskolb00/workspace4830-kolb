

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.UtilDB;

/**
 * Servlet implementation class CreateUser
 */
@WebServlet("/CreateUser")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password"); 
		String firstname = request.getParameter("firstname"); 
		String lastname = request.getParameter("lastname"); 
		String email = request.getParameter("email"); 
		Integer admin = 0; 
		String header = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\r\n"
				+ "    pageEncoding=\"ISO-8859-1\"%>\r\n"
				+ "  <script>\r\n"
				+ "  </script>\r\n"
				+ "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Home Page</title>\r\n"
				+ "<link rel= \"stylesheet\" href=\"style.css\" type=\"text/css\">\r\n"
				+ "</head>\r\n"
				+ "<%@ include file=\"header.jsp\" %>\r\n"
				+ "<body>"; 
		String footer = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\r\n"
				+ "    pageEncoding=\"ISO-8859-1\"%>\r\n"
				+ "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Footer</title>\r\n"
				+ "<link rel= \"stylesheet\" href=\"style.css\" type=\"text/css\">\r\n"
				+ "</head>\r\n"
				+ "<footer>\r\n"
				+ "	<h3>Footer</h3>\r\n"
				+ "</footer>\r\n"
				+ "</html>"; 
		if(UtilDB.createUser(username, password, firstname, lastname, email, admin)) {
		
			response.getWriter().println(header+"<br/><br/>User: "+username+" Successfully Created!<br/><br/>"+footer); 
			
		}else {
			response.getWriter().println(header+"<br/></br>User: "+username+" Creation Failed!<br/><br/>" + footer);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}