package com.passenger;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
       private static String URL = "jdbc:mysql://localhost:3306/traindb?autoReconnect=true&useSSL=false";
       private static String USERNAME = "root";
	   private static String PASSWORD = "piumi0831#";
	   private static Connection con;
	   
	   /**
	     * Establishes a database connection and returns the Connection object.
	     * @return Connection object representing the database connection.
	     */
	   
	   public static Connection getConnection() {

	        try {
	        	 // Load the MySQL JDBC driver
	            Class.forName("com.mysql.jdbc.Driver"); 
	            
	            // Establish the database connection using provided URL, username, and password
	            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

	        }
	        catch(Exception e) {
	        	
	        	System.out.println("DB connection not success!!");
	        	
	        }

	        // Return the established Connection object
	        return con;

}
}