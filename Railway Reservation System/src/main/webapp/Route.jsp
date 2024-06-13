<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking a Seat</title>
<link rel="stylesheet" href="stylesheet.css">
</head>
<body>
<img class="i" src="girl.jpg" width="700px" height="500px">
<div class="container">
    <div class="booking-form">
        <h2 class="topic">Book your seat here...</h2>
        <form class="form" action="InsertBookingServlet" method="post">
            <div class="form-group">
                 <label class="lable"for="bookingid">BookingID</label>
                   <input type="text" id="bookingid" name="bookingid">
                <label class="label" for="departure-station">From:</label> 
                <select id="departure-station" name="departure-station" required>
                    <option value="">Choose Station</option>
                    <option value="Colombo Fort">Colombo Fort(05.55.00)</option>
                    <option value="Kandy">Kandy(05.15.00)</option>
                    <option value="Colombo Fort">Colombo Fort(16.20.00)</option>
                    
                </select>
                <label class="label" for="destination">To:</label>
                <select id="destination-station" name="destination-station" required>
                    <option value="">Choose Station</option>
                    <option value="Badulla">Badulla(16.00.00)</option>
                    <option value="Colombo Fort">Colombo Fort(18.55.00)</option>
                    <option value="Vavuniya">Vavuniya(20.57.00)</option>
                </select>
            </div>
            <div class="form-group">
                <label class="label" for="departure-date">Date:</label>
                <input type="date" id="departure-date" name="departure-date" required>
            </div>
            <div class="form-group">
                <label class="label" for="passenger-count">Number of Passengers:</label>
                <input type="number" id="passenger-count" name="passenger-count" min="1" required>
            </div>
            <div class="form-group">
                <label class="label"for="train">Select Train:</label>
                <select id="train" name="train" required>
                 <option value="">Choose Train</option>
                    <option value="Udarata Menike">Udarata Menike</option>
                    <option value="Express">Express</option>
                    <option value="Yal Devi">Yal Devi</option>
                </select>
            </div>
            <div class="form-group">
                <label class="label" for="class">Select Class:</label>
                <select id="class" name="class" required>
                 <option value="">Choose Class</option>
                    <option value="first-class">First Class</option>
                    <option value="second-class">Second Class</option>
                     <option value="third-class">Third Class</option>
                </select>
            </div>
            <button type="reset" class="btn reset-btn">Reset</button> 
            <button type="submit" class="btn search-btn">Submit</button>
        </form>
    </div>
</div>
</body>
</html>
