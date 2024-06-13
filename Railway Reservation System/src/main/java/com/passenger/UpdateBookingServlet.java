package com.passenger;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*servlet mapping to handle update booking requests.*/
@WebServlet("/update")
public class UpdateBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Method to handle HTTP POST requests.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Retrieve booking details from request parameters.
		String BookingID=request.getParameter("BookingID");
		String Departure=request.getParameter("Departure");
		String Destination=request.getParameter("Destination");
		String Date=request.getParameter("Date");
		String NoofPassengers=request.getParameter("NoofPassengers");
		String Train=request.getParameter("Train");
		String Class=request.getParameter("Class");
		
		
		boolean isTrue;
		
		// Call RouteDButil's updateBookings method to update booking details.
		isTrue=RouteDButil.updateBookings(BookingID,Departure, Destination, Date, NoofPassengers, Train, Class);
		
		// If booking update is successful, retrieve updated details and forward to success.jsp.
		if(isTrue==true) {
		
			// Retrieve updated booking details.
			List<bookings>Bookedetails=RouteDButil.getBookingDetails(BookingID);
			request.setAttribute("Bookedetails",Bookedetails);
			
			// Forward to success.jsp.
			RequestDispatcher dis=request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		// If update fails, forward to unsuccess.jsp.
		else{
			RequestDispatcher dis=request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
			
		}
	}
	
	


