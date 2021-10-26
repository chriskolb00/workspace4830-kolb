<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account Page</title>
<link rel= "stylesheet" href="style.css" type="text/css">
</head>
<%@ include file="header.jsp" %>
<body>
<h1 style="margin: 1% 30%;"> Creating a New Account!</h1>
<form action= "CreateClub" method="post">
	<table style= "margin-left:30%; width: 40%; height= 30%; ">
		<tr> <td> New Club Name </td> <td> <input type="text" name= "clubname"> </td> </tr>
		<tr> <td> <input type="submit" name= "login"> </td> </tr>
	</table>
</form>
</body>
<%@ include file="footer.jsp" %>
</html>