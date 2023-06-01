package com.wiley.jdbcapp.util;

import java.sql.*;

import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;

public class BatchProcessing {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String query = "select * from employee";
		
		String query2 = "delete from employee where id = 1";
		
		Connection conn = null;
		
		 conn = DBConnection.createDBConnection();
		
		 conn.setAutoCommit(false);
		 
//		 conn.commit();    
		
		Statement st = conn.createStatement();
		
	   st.addBatch(query2);
	   
	   st.executeBatch();
//		  conn.rollback();
        conn.commit();

	}

}
