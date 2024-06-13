package com.passenger;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/InsertBookingServlet")
public class InsertBookingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    // Method to handle HTTP POST requests.
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    	 // Retrieve booking details from request parameters.
    	int BookingID=Integer.parseInt(request.getParameter("bookingid"));
        String Departure= request.getParameter("departure-station");
        String Destination = request.getParameter("destination-station");
        String Date = request.getParameter("departure-date");
        int NoofPassengers = Integer.parseInt(request.getParameter("passenger-count"));
        String Train= request.getParameter("train");
        String TravelClass = request.getParameter("class");
        

       
     // If booking insertion is successful, forward the request to UpdateBookingForm.jsp.
        boolean isTrue = RouteDButil.insertbookings(BookingID,Departure,Destination,Date,NoofPassengers,Train,TravelClass);

        if (isTrue==true) {
        	
        	
        	RequestDispatcher dis = request.getRequestDispatcher("UpdateBookingForm.jsp");
            dis.forward(request, response);
            
         // If insertion fails, forward the request to unsuccess.jsp.    
        } else {
            RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
            dis.forward(request, response);
        }
    }
}
