package com.passenger;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;

public class RouteDButil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;

    public static boolean insertbookings(int BookingID,String Departure, String Destination, String Date,int NoofPassengers,String Train,String TravelClass) {
        boolean isSuccess=false;
        

        try {

            con = DBconnect.getConnection();
            stmt=con.createStatement();
          
			String sql="insert into bookings(BookingID,Departure,Destination,Date,NoofPassengers,Train,TravelClass) values('"+BookingID+"','"+Departure+"','"+Destination+"','"+Date+"','"+NoofPassengers+"','"+Train+"','"+TravelClass+"')";
            int rs=stmt.executeUpdate(sql);
            
            /*Validate the insertion and provided data*/
            if(rs>0 && 
            		Departure != null && !Departure.isEmpty() &&
                    Destination != null && !Destination.isEmpty() &&
                    Date != null && !Date.isEmpty() &&
                    NoofPassengers > 0 &&
                    Train != null && !Train.isEmpty() &&
                    TravelClass != null && !TravelClass.isEmpty()) { 
            	
            	        isSuccess=true;
            }else {
            	isSuccess=false;
            }
        }
            catch(Exception e) {
            	e.printStackTrace();
            }
            return isSuccess;
        }    


public static List<bookings> getBookingDetails(String BookingId){
	
	int BookingID=Integer.parseInt(BookingId);
	
	ArrayList <bookings> b1=new ArrayList<>();
	
	try {
		con=DBconnect.getConnection();
		stmt=con.createStatement();
		String sql="select * from bookings where BookingID='"+BookingID+"'";	
		ResultSet rs=stmt.executeQuery(sql);
	
		
		while(rs.next()) {
			
	        
			String Departure=rs.getString(2);
			String Destination=rs.getString(3);
			String Date=rs.getString(4);
			int NoofPassengers=rs.getInt(5);
			String Train=rs.getString(6);
			String TravelClass=rs.getString(7);
			
			bookings b=new bookings(BookingID,Departure,Destination,Date,NoofPassengers,Train,TravelClass);
			b1.add(b);
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return b1;
}

 public static boolean updateBookings(String BookingID,String Departure,String Destination,String Date,String NoofPassengers,String Train,String TravelClass){
	
	 try {
		 con=DBconnect.getConnection();
		 stmt=con.createStatement();
		 String sql="update bookings set  Departure='"+Departure+"',Destination='"+Destination+"',Date='"+Date+"',NoofPassengers='"+NoofPassengers+"',Train='"+Train+"',TravelClass='"+TravelClass+""
		 		+ "'where BookingID='"+BookingID+"'" ;
			 ;
		 int rs=stmt.executeUpdate(sql);
		 
		 if(rs>0) {
			 isSuccess=true;
		 }
		 else {
			 isSuccess=false;
		 }
		 
		 
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
 return isSuccess;
	 
 }
 
 public static boolean deleteCustomer(String BookingID) {
	 
	 int convID=Integer.parseInt(BookingID);
	 
	 try {
		 con=DBconnect.getConnection();
		 stmt=con.createStatement();
		String sql="delete from bookings where BookingID='"+convID+"'";
		int rs=stmt.executeUpdate(sql);
		 
		 if(rs>0) {
			 isSuccess=true;
		 }
		 else {
			 isSuccess=false;
		 }
		 
		 
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
 return isSuccess;
	 
	 
 }


}