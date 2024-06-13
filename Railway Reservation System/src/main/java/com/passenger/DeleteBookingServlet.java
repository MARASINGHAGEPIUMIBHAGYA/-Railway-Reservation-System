package com.passenger;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Method to handle HTTP POST requests.
@WebServlet("/delete")
public class DeleteBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		// Retrieve BookingID from request parameter.
		String BookingID=request.getParameter("BookingID");
	    boolean isTrue;
	    
	    isTrue=RouteDButil.deleteCustomer(BookingID);
	    

        if (isTrue==true) {
        	
        	
        	RequestDispatcher dis = request.getRequestDispatcher("Route.jsp");
            dis.forward(request, response);
            
            
        } else {
        	
            RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
            dis.forward(request, response);
        }
	}
        }
