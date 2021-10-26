<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Activities(Events)</title>
<link rel= "stylesheet" href="style.css" type="text/css">
</head>
<%@ include file="header.jsp" %>

<style>
p button{
height:100px; width: 150px;
padding: 5px 5px;
margin:2%;
border-radius: 10%;
font-size:20px;
background-color: lightgray;
}
</style>
<body>
<!-- Eventually use database data to display events, right now just creating testing boxes events -->
	<% 
	out.println("<p>");
	for(int i=0; i<3; i++){
		for(int j=0; j<5; j++){
			out.println("<button> Random Event </button>");
		}
		out.println("<br>");
	}
	out.println("</p>");
	%>
	<a href= "/webproject-alphas/createEvent.jsp"><button>Create a new event!</button></a>
</body>
</html>
<%@ include file="footer.jsp" %>