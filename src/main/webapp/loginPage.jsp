<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel= "stylesheet" href="style.css" type="text/css">
<%@ include file="header.jsp" %>
</head>


<body>
<h1 style="margin: 5% 30%;"> Welcome to the Login Page!</h1>


<form action= "Login" method="post">
	<table style= "margin-left:30%; width: 40%; height= 30%; ">
	
		<tr> <td> *Username </td> <td> <input type="text" name= "username" required> </td> </tr>
		<tr> <td> *Password </td> <td> <input type="text" name= "password" required> </td> </tr>
		<tr> <td> <input type="submit" name= "login" value="Login"> </td> </tr>
		
		
		
	</table>
</form>
<a style="border: solid black 1px; " href="/webproject-alphas/create.jsp"><button>Create Account</button> </a> 
</body>
<%@ include file="footer.jsp" %>