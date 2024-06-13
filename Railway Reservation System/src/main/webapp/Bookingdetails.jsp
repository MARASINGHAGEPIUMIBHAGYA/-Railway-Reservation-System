<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Railway Reservation System</title>
</head>
<body class="body">
    <div class="container3">
        <div class="booking-details">
            <h1>Booking Details</h1>
            <div class="form-container">
             <!-- Table for displaying booking details fetched from the server -->
                <table border="1">
                
           <!-- Loop through the list of booking details using JSTL forEach tag -->
                <c:forEach var="b1" items="${Bookedetails}">
                     
            <c:set var="BookingID" value="${b1.BookingID}"/>  
            <c:set var="Departure" value="${b1.Departure}"/>
            <c:set var="Destination" value="${b1.Destination}"/>
            <c:set var="Date" value="${b1.Date}"/>
            <c:set var="NoofPassengers" value="${b1.NoofPassengers}"/>
            <c:set var="Train" value="${b1.Train}"/>
            <c:set var="Class" value="${b1.TravelClass}"/>
            
            <!-- Display booking details in table rows -->
                    <tr>
                        <td>BookingID</td>
                        <td>${b1.BookingID}</td>
                    </tr>
                    <tr>
                        <td>Departure</td>
                        <td>${b1.Departure}</td>
                    </tr>
                    <tr>
                        <td>Destination</td>
                        <td>${b1.Destination}</td>
                    </tr>
                    <tr>
                        <td>Date</td>
                        <td>${b1.Date}</td>
                    </tr>
                    <tr>
                        <td>No of Passengers</td>
                        <td>${b1.NoofPassengers}</td>
                    </tr>
                    <tr>
                        <td>Train</td>
                        <td>${b1.Train}</td>
                    </tr>
                    <tr>
                        <td>TravelClass</td>
                        <td>${b1.TravelClass}</td>
                    </tr>
                    </c:forEach>
                </table>
            </div>
            <br>
            <br>
            
                <!-- Create a URL for updating bookings with parameters -->
            <div class="button-container">
            
            <c:url value="UpdateBookings.jsp" var="BookingsUpdate">
            <c:param name="BookingID" value="${BookingID}"/>
            <c:param name="Departure" value="${Departure}"/>
            <c:param name="Destination" value="${Destination}"/>
            <c:param name="Date" value="${Date}"/>
            <c:param name="NoofPassengers" value="${Train}"/>
            <c:param name="Class" value="${TravelClass}"/>
            </c:url>
            <a href="${BookingsUpdate}">
                <input class="update-button "type="button" value="Update">
                </a>
                
                <!-- Create a URL for deleting bookings with parameters -->
                <br>
            <c:url value="DeleteBookings.jsp" var="BookingsDelete">
            <c:param name="BookingID" value="${BookingID}"/>
            <c:param name="Departure" value="${Departure}"/>
            <c:param name="Destination" value="${Destination}"/>
            <c:param name="Date" value="${Date}"/>
            <c:param name="NoofPassengers" value="${Train}"/>
            <c:param name="Class" value="${TravelClass}"/>
            </c:url>
                
                <a href="${BookingsDelete.jsp}">
                <input class="delete-button "type="button" name="delete"value="Delete">
                </a>
            </div>
        </div>
    </div>
</body>
</html>
