<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel= "stylesheet" href="style.css" type="text/css">
</head>
<%@ include file="header.jsp" %>
<body>
<%
//allow access only if session exists
String user = null;
String message = null; 
if(session.getAttribute("user") == null){
	message = "<div style=\"margin-top: 20%; font-size: 20px; text-align:center;\"> EASY ACCESS TO UNO'S CLUBS AND ACTIVITES, CLICK LOGIN TO BEGIN!!</div>"; 
	out.print(message); 
}else {user = (String) session.getAttribute("user");
String userName = null;
String sessionID = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("user")) userName = cookie.getValue();
	if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
}
}
message = "<div style=\"margin-top: 20%; font-size: 20px; text-align:center;\"> HELLO " + userName +", What do you want to do today? </div>";
out.print(message); 
}
%>

	
</body>
<%@ include file="footer.jsp" %>
</html>