package com.wiley.jdbcapp.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String query = "UPDATE candidates SET resume = ? WHERE id=?";
		
		File file = new File("C:\\Users\\Sachin Kumar\\Downloads\\MyResumes\\Sachin_Kumar_Resume__");
		
		try {
			
			Connection conn = DBConnection.createDBConnection();
			PreparedStatement ps = conn.prepareStatement(query);
		
	            FileInputStream fname = new FileInputStream(file);


	            ps.setBinaryStream(5, fname);
	         

	            System.out.println("Added file in the database");
	            ps.executeUpdate();


			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		

	}

}
