package com.passenger;

public class bookings {
	
	// Private member variables to store booking information.
	private int BookingID;
	private String Departure;
	private String Destination;
	private String Date;
	private int NoofPassengers;
	private String Train;
	private String TravelClass;
	
	// Constructor to initialize the booking information.
	public bookings(int BookingID,String Departure,String Destination,String Date,int NoofPassengers,String Train,String TravelClass) {
		this.BookingID=BookingID;
		this.Departure=Departure;
		this.Destination=Destination;
		this.Date=Date;
		this.NoofPassengers=NoofPassengers;
		this.Train=Train;
		this.TravelClass=TravelClass;
	}

	// Getter and setter methods for accessing and modifying private member variables.
	public int getBookingID() {
		return BookingID;
	}

	public void setBookingID(int bookingID) {
		BookingID = bookingID;
	}

	public String getDeparture() {
		return Departure;
	}

	public void setDeparture(String departure) {
		Departure = departure;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getNoofPassengers() {
		return NoofPassengers;
	}

	public void setNoofPassengers(int noofPassengers) {
		NoofPassengers = noofPassengers;
	}

	public String getTrain() {
		return Train;
	}

	public void setTrain(String train) {
		Train = train;
	}

	public String getTravelClass() {
		return TravelClass;
	}

	public void setTravelClass(String travelClass) {
		TravelClass = travelClass;
	}

	
}
