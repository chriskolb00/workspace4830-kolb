import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.UtilDB;

/**
 * Servlet implementation class CreateUser
 */
@WebServlet("/CreateEvent")
public class CreateEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//need utilDB to create databases for creating events
		
		String eventName = request.getParameter("eventName");
		String info = request.getParameter("info");
		String date = request.getParameter("date");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
		String location = request.getParameter("location");
			response.getWriter().println("<h1><center>Thanks for creating an event!"
					+ "<br> Event name: "+eventName
					+ "<br> Info: "+ info
					+ "<br> Date: "+ date
					+ "<br> Time: "+ startTime
					+ " to "+ endTime
					+ "<br> Location: "+ location+"</center></h>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RequestDispatcher dispatcher = request.getRequestDispatcher("events.jsp");
		String Name = "What sup baby";
		request.setAttribute("0.........................................................................................0....0.0.00..000000000000000000000000000000000000000000000000000000000000.0..00..00.......000..0.....000000000.0000..........................................................0"
				+ "","Temp");
		dispatcher.forward(request, response);
	}

}