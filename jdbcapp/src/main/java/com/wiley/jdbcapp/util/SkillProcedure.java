package com.wiley.jdbcapp.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SkillProcedure {
	
	static Connection conn = null;

	public static void getCandidates()
	{
		conn = DBConnection.createDBConnection();
		
	    String query = "{Call get_candidate_skill(?)}";
	    
	    
	    
	    
	    try {
	  	   PreparedStatement ps = conn.prepareStatement(query);
	         
	         ResultSet rs = ps.executeQuery();
	         
	         while(rs.next()) {
					System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
					System.out.println("-------------------------------------------");
				}

	 	} catch (Exception e) {
	 		// TODO: handle 
	    e.printStackTrace();
	 	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
