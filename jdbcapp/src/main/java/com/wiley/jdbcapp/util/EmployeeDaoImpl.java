package com.wiley.jdbcapp.util;

import java.sql.*;

public  class EmployeeDaoImpl implements EmployeeDao{
	
	Connection conn;
	
	public void createEmployee(Employee emp) {
		
		 conn = DBConnection.createDBConnection();
		 
		 String query = "INSERT INTO employee values(?,?,?,?)";
		 
		 try {
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			
			ps.setInt(3, emp.getSalary());
			
			ps.setInt(4, emp.getId());
			
			int count = ps.executeUpdate();
			
			if(count !=0 )
			{
				 System.out.println("Employee created successfully");
			}
			else
			{
				 System.out.println("Employee creation failed");

			}
			
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();

		}
		
	}

	public void getAllEmployees() {
		
		conn = DBConnection.createDBConnection();
		String query = "SELECT * FROM employee";
		System.out.println("-------------------------------------------");
		System.out.format("%s\t%s\t%s\t%s\t", "ID","Name","Salary","Age");
		System.out.println("-------------------------------------------");
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
				System.out.println("-------------------------------------------");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		
	}

	public void getEmpById(int id) {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();
		String query = "SELECT * FROM employee where id ="+id;
		System.out.println("-------------------------------------------");
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
		
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
				System.out.println("-------------------------------------------");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		
	}

	

		
	


  

public void updateEmpNameById(int id, String name) {
	// TODO Auto-generated method stub
	 
	
}

public void deleteEmpById(int id) {
	// TODO Auto-generated method stub
	conn = DBConnection.createDBConnection();
    String query = "delete from employee where id = ?";
   
    try {
 	   PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        int count = ps.executeUpdate();
        if(count > 0) {
            System.out.println("Employee deleted successfully");
        } else {
            System.out.println("Employee deletion failed");
        }

	} catch (Exception e) {
		// TODO: handle 
   e.printStackTrace();
	}
	
}

public void findEmp(String exp) {
	
//  System.out.println("SELECT * FROM employee WHERE name LIKE "+exp);
	// TODO Auto-generated method stub
	conn = DBConnection.createDBConnection();
	String s = "'" + exp + "%'";
    String query = "SELECT * FROM employee WHERE name LIKE "+s;
    
    
    
    
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

public void sortEmployee(int s) {
	
	conn = DBConnection.createDBConnection();
	
	String query;
	
	if(s==1)
	{
		query =  "SELECT * FROM employee order by salary";
	} 
	else
	{
		query = "SELECT * FROM employee order by salary desc";
	}
	
	
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



	

}

// search by emp name (like)

// sort the emp asc desc
