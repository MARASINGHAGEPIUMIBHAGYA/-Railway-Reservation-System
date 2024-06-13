<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bookings</title>
<link rel="stylesheet" href="stylesheet.css">
</head>
<body class="b">
   <%
   String BookingID=request.getParameter("bookingid");
   String Departure=request.getParameter("departure-station");
   String Destination=request.getParameter("destination-station");
   String Date=request.getParameter("departure-date");
   String NoofPassengers=request.getParameter("passenger-count");  
   String Train=request.getParameter("train");
   String TravelClass=request.getParameter("class");
   
   %>
   
<div class="container4">
<form class="f"action="update"method="post">
<div class="d">
<form action="submit_form.php" method="post"> <!-- Replace "submit_form.php" with your form processing script -->
    <table class="t">
        <tr>
            <th>BookingID</th>
            <td><input type="text" name="BookingID" value="<%= BookingID %>"></td>
        </tr>
        <tr>
            <th>Departure</th>
            <td><input type="text" name="Departure" value="<%= Departure %>"></td>
        </tr>
        <tr>
            <th>Destination</th>
            <td><input type="text" name="Destination" value="<%= Destination %>"></td>
        </tr>
        <tr>
            <th>Date</th>
            <td><input type="text" name="Date" value="<%= Date %>"></td>
        </tr>
        <tr>
            <th>NoofPassengers</th>
            <td><input type="text" name="NoofPassengers" value="<%= NoofPassengers %>"></td>
        </tr>
        <tr>
            <th>Train</th>
            <td><input type="text" name="Train" value="<%= Train %>"></td>
        </tr>
        <tr>
            <th>Class</th>
            <td><input type="text" name="Class" value="<%= TravelClass %>"></td>
        </tr>
    </table>
    <br>'
    <br>
    

<Button class="update-button" type="submit" name="update" >Update</Button><br><br>



</form>
<a href="DeleteBookings.jsp">
 <input class="delete-button "type="button" name="delete"value="Delete">
 </a>

</div>
</body>
</html>