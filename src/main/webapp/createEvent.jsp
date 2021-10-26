<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Event</title>
<link rel= "stylesheet" href="style.css" type="text/css">
</head>
<%@ include file="header.jsp" %>
<style>
table{
	font-family: "Times New Roman", Times, serif;
	font-weight: bold;
}

</style>
<body>
<h1 style="margin: 1% 30%;"> Make a New Event!</h1>


<form action= "CreateEvent" method="post">
	<table style= "margin-left:30%; width: 40%; height= 30%; ">
		
		<tr> <td> *Event Name: </td> <td> <input type="text" placeholder="required" name= "eventName" required> </td> </tr>
		<tr> <td> Event Information: </td> <td> <input style="height:100px; width:300px;" type="text" placeholder="optional"name= "info"> </td> </tr>
		<tr> <td> *Date of Event: </td> <td> <input type="date" placeholder="MM/DD/YYYY" name= "date"required> </td> </tr>
		<tr> <td> *Start Time: </td> <td> <input type="time" placeholder="required"name= "startTime"required> </td> </tr>
		<tr> <td> *End Time: </td> <td><input type="time" placeholder="required"name= "endTime"required></td> </tr>
		<tr> <td> *Location: </td> <td><input type="text"  placeholder="required"name= "location"required></td> <td>  
		<tr> <td> <input type="submit" style="height:30px; width:150px;"name= "create" value="Create Event"required> </td> </tr>
	</table>
</form>
</body>
<%@ include file="footer.jsp" %>
</html>