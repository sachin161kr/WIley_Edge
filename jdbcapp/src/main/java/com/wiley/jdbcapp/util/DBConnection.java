package com.wiley.jdbcapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {

	public static Connection createDBConnection() {
		
        Connection connection = null;
        
      
        
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	connection = DriverManager.getConnection(
        			  "jdbc:mysql://localhost:3306/wileyjdbc",
        			  "root", "imsachin@161");		
        	  
        	System.out.println("Connection Success");
        	
        	return connection;

        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
		return connection;

	}

}
