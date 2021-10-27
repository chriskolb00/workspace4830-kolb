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
		<tr> <td> *Date of Event: </td> <td> 
		<select style="margin-left:100px;"name="month" id= "month" required> 
			<option id ="month1" value = "1">Jan</option>
			<option id ="month2" value = "2">Feb</option>
			<option id ="month3" value = "3">Mar</option>
			<option id ="month4" value = "4">Apr</option>
			<option id ="month5" value = "5">May</option>
			<option id ="month6" value = "6">Jun</option>
			<option id ="month7" value = "7">Jul</option>
			<option id ="month8" value = "8">Aug</option>
			<option id ="month9" value = "9">Sep</option>
			<option id ="month10" value = "10">Oct</option>
			<option id ="month11" value = "11">Nov</option>
			<option id ="month12" value = "12">Dec</option>
		</select> 
		<select name="day" id="day" required>
			<option value = "1">1</option>
			<option value = "2">2</option>
			<option value = "3">3</option>
			<option value = "4">4</option>
			<option value = "5">5</option>
			<option value = "6">6</option>
			<option value = "7">7</option>
			<option value = "8">8</option>
			<option value = "9">9</option>
			<option value = "10">10</option>
			<option value = "11">11</option>
			<option value = "12">12</option>
			<option value = "13">13</option>
			<option value = "14">14</option>
			<option value = "15">15</option>
			<option value = "16">16</option>
			<option value = "17">17</option>
			<option value = "18">18</option>
			<option value = "19">19</option>
			<option value = "20">20</option>
			<option value = "21">21</option>
			<option value = "22">22</option>
			<option value = "23">23</option>
			<option value = "24">24</option>
			<option value = "25">25</option>
			<option value = "26">26</option>
			<option value = "27">27</option>
			<option value = "28">28</option>
			<option value = "29">29</option>
			<option value = "30">30</option>
			<option value = "31">31</option>
		</select>
		<select name="year" id="year" required>
			<option value="2021">2021</option>
			<option value="2022">2022</option>
		</select>
		</td> </tr>
		<tr> <td> *Start Time: </td> <td> 
		<select name="startTime" id="startTime" required>
			<option value="0000">00 00</option>
			<option value="0100">01 00</option>
			<option value="0200">02 00</option>
			<option value="0300">03 00</option>
			<option value="0400">04 00</option>
			<option value="0500">05 00</option>
			<option value="0600">06 00</option>
			<option value="0700">07 00</option>
			<option value="0800">08 00</option>
			<option value="0900">09 00</option>
			<option value="1000">10 00</option>
			<option value="1100">11 00</option>
			<option value="1200">12 00</option>
			<option value="1300">13 00</option>
			<option value="1400">14 00</option>
			<option value="1500">15 00</option>
			<option value="1600">16 00</option>
			<option value="1700">17 00</option>
			<option value="1800">18 00</option>
			<option value="1900">19 00</option>
			<option value="2000">20 00</option>
			<option value="2100">21 00</option>
			<option value="2200">22 00</option>
			<option value="2300">23 00</option>
			<option value="2400">24 00</option>
		</select> </td> </tr>
		<tr> <td> *End Time: </td> <td>
		<select name="endTime" id="endTime" required>
			<option value="0000">00 00</option>
			<option value="0100">01 00</option>
			<option value="0200">02 00</option>
			<option value="0300">03 00</option>
			<option value="0400">04 00</option>
			<option value="0500">05 00</option>
			<option value="0600">06 00</option>
			<option value="0700">07 00</option>
			<option value="0800">08 00</option>
			<option value="0900">09 00</option>
			<option value="1000">10 00</option>
			<option value="1100">11 00</option>
			<option value="1200">12 00</option>
			<option value="1300">13 00</option>
			<option value="1400">14 00</option>
			<option value="1500">15 00</option>
			<option value="1600">16 00</option>
			<option value="1700">17 00</option>
			<option value="1800">18 00</option>
			<option value="1900">19 00</option>
			<option value="2000">20 00</option>
			<option value="2100">21 00</option>
			<option value="2200">22 00</option>
			<option value="2300">23 00</option>
			<option value="2400">24 00</option>
		</select>
		</td> </tr>
		<tr> <td> *Location: </td> <td><input type="text"  placeholder="required"name= "location"required></td> <td>  
		<tr> <td> <input type="submit" style="height:30px; width:150px;"name= "create" value="Create Event"required> </td> </tr>
	</table>
</form>
</body>
<%@ include file="footer.jsp" %>
</html>