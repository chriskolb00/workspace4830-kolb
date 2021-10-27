import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.UtilDB;

/**
 * Servlet implementation class CreateUser
 */
@WebServlet("/CreateClub")
public class CreateClub extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateClub() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String clubname = request.getParameter("clubname");
		HttpSession session = request.getSession(); 
		int userId = (int)session.getAttribute("id"); 

		String header = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\r\n"
				+ "    pageEncoding=\"ISO-8859-1\"%>\r\n" + "  <script>\r\n" + "  </script>\r\n" + "<!DOCTYPE html>\r\n"
				+ "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n" + "<title>Home Page</title>\r\n"
				+ "<link rel= \"stylesheet\" href=\"style.css\" type=\"text/css\">\r\n" + "</head>\r\n"
				+ "<%@ include file=\"header.jsp\" %>\r\n" + "<body>";
		String footer = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\r\n"
				+ "    pageEncoding=\"ISO-8859-1\"%>\r\n" + "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n" + "<title>Footer</title>\r\n"
				+ "<link rel= \"stylesheet\" href=\"style.css\" type=\"text/css\">\r\n" + "</head>\r\n" + "<footer>\r\n"
				+ "	<h3>Footer</h3>\r\n" + "</footer>\r\n" + "</html>";
		if (!UtilDB.clubExists(clubname)) {
			int clubId = UtilDB.createClub(clubname, userId); 
			
			if (clubId != 0) {

				response.getWriter()
						.println(header + "<br/><br/>Club: " + clubname + " Successfully Created!<br/><br/>" + footer);
				response.setHeader("Refresh", "10; home.jsp?clubID="+clubId);
			} else {
				response.getWriter()
						.println(header + "<br/></br>UserClub: " + clubname + " Creation Failed!<br/><br/>" + footer);
				response.setHeader("Refresh", "10; creatClub.jsp");
			}
		} else {
			response.getWriter().println(header + "<br/></br>A Club with name,  " + clubname
					+ " already exists. Please use a different name!<br/><br/>" + footer);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}