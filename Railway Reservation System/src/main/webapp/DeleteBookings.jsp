<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete reservations</title>
<link rel="stylesheet" href="stylesheet.css">
</head>
<body class="body4">
 <%
   String BookingID=request.getParameter("Bookingid");
   String Departure=request.getParameter("Departure");
   String Destination=request.getParameter("Destination");
   String Date=request.getParameter("Date");
   String NoofPassengers=request.getParameter("NoofPassengers");  
   String Train=request.getParameter("Train");
   String TravelClass=request.getParameter("TravelClass");
   
   %>
<div class="div3">
<form class="f"action="delete"method="post">

BookingID:<input class="input" type="text" name="BookingID"value="<%= BookingID%>"><br><br><br>
<!--  Departure:<input type="text" name="Departure"value="<%= Departure%>"><br><br><br>
Destination:<input type="text" name="Destination"value="<%= Destination%>"><br><br><br>
Date:<input type="text" name="Date"value="<%= Date%>"><br><br><br>
NoofPassengers:<input type="text" name="NoofPassengers"value="<%= NoofPassengers%>"><br><br><br>
Train:<input type="text" name="Train"value="<%= Train%>"><br><br><br>
Class:<input type="text" name="Class"value="<%= TravelClass%>"><br>-->

<Button class="bu" type="submit" name="delete">Delete</Button>
</form>
</div>
</body>
</html>