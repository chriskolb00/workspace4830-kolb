// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;
 
// Extend HttpServlet class
@WebServlet("/SessionTrack")
public class SessionTrack extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SessionTrack() {
		super(); 
	}
 
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("here"); 
      // Create a session object if it is already not  created.
      HttpSession session = request.getSession(true);
      System.out.println("here2"); 
      // Get session creation time.
      Date createTime = new Date(session.getCreationTime());
         
      // Get last access time of this web page.
      Date lastAccessTime = new Date(session.getLastAccessedTime());

      String title = "Welcome Back to my website";
      Integer visitCount = 0;
      String visitCountKey = new String("visitCount");
      String userIDKey = new String("userID");
      String userID = new String("ABCD");
      System.out.println("here3"); 
      // Check if this is new comer on your web page.
      if (session.isNew()) {
         title = "Welcome to my website";
         session.setAttribute(userIDKey, userID);
         System.out.println("here4"); 
      } else {
    	 System.out.println("here5"); 
    	 try {
         visitCount = (Integer)session.getAttribute(visitCountKey);
    	 } catch (Exception e) {
    		visitCount = 1;  
    	 }
    	 
    	 if (visitCount == null) {
    		 visitCount = 1; 
    	 } else {
         visitCount = visitCount + 1;
         }
    	 System.out.println("VisitCount: "+visitCount.toString()); 
         try {
        	 System.out.println("here5.55"); 
         userID = (String)session.getAttribute(userIDKey);
         System.out.println("here5.6"); 
         } catch(Exception e) {
        	 userIDKey = new String("userID");
         }
      }
      System.out.println("here6"); 
      session.setAttribute(visitCountKey,  visitCount);
      System.out.println("here7"); 
      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();

      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";

      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<h2 align = \"center\">Session Infomation</h2>\n" +
               "<table border = \"1\" align = \"center\">\n" +
                  
                  "<tr bgcolor = \"#949494\">\n" +
                  "  <th>Session info</th><th>value</th></tr>\n" +
                     
                  "<tr>\n" +
                     "  <td>id</td>\n" +
                     "  <td>" + session.getId() + "</td> </tr>\n" +
                  
                  "<tr>\n" +
                     "  <td>Creation Time</td>\n" +
                     "  <td>" + createTime + "  </td></tr>\n" +
                  
                  "<tr>\n" +
                     "  <td>Time of Last Access</td>\n" +
                     "  <td>" + lastAccessTime + "  </td></tr>\n" +
                  
                  "<tr>\n" +
                     "  <td>User ID</td>\n" +
                     "  <td>" + userID + "  </td> </tr>\n" +
                  
                  "<tr>\n" +
                     "  <td>Number of visits</td>\n" +
                     "  <td>" + visitCount + "</td></tr>\n" +"</table>\n" +
            "</body></html>"
      );
   }
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}