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
<form action= "createServlet" method="post">
	<table style= "margin-left:30%; width: 40%; height= 30%; ">
		<tr> <td> First Name:</td> <td> <input type="text" name= "Nusername"required> </td> </tr>
		<tr> <td> Last Name: </td> <td> <input type="text" name= "Nusername"required> </td> </tr>
		<tr> <td> Email: </td> <td> <input type="email" name= "Nusername"required> </td> </tr>
		<tr> <td> Enter New Username: </td> <td> <input type="text" name= "Nusername" required> </td> </tr>
		<tr> <td> Enter New Password: </td> <td> <input type="password" name= "Npassword"required> </td> </tr>
		<tr> <td> Confirm Password: </td> <td> <input type="password" name= "Rpassword"required> </td> </tr>
		<tr> <td> <input style="height: 30px; width: 250px;" type="submit" name= "login" value = "Submit"> </td> </tr>
	</table>
</form>
</body>
<%@ include file="footer.jsp" %>
</html>
