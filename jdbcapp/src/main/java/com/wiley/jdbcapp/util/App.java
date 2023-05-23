package com.wiley.jdbcapp.util;

import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	EmployeeDaoImpl e = new EmployeeDaoImpl();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true)
    	{
    		
    		
    		System.out.println("1 : Add Employee");
        	System.out.println("2 : Show all employees");
        	System.out.println("3 : Show employee based on id");
        	System.out.println("4 : Update employee");
        	System.out.println("5 : delete employee");
        	System.out.println("6 : Search Employee");
        	System.out.println("7 : Sort Employees by Salary");
        	System.out.println("8 : Exit");
        	
        	int n = sc.nextInt();
    		
    		if(n==1)
    		{
    			System.out.println("Enter employee id");
    			
                int id = sc.nextInt();
                
                System.out.println("Enter employee name");
                
                
                String name = sc.next();
                
                System.out.println("Enter employee salary");
                int salary = sc.nextInt();
                System.out.println("Enter employee age");
                int age = sc.nextInt();
                
                Employee emp = new Employee(id,name,salary,age);
                
                e.createEmployee(emp);
                
                
                
    		}
    		else if(n==2)
    		{
    			
    			
    			e.getAllEmployees();
    		}
    		else if(n==3)
    		{
    			System.out.println("Enter Employee Id");
    			
    			int id = sc.nextInt();
    			
    			e.getEmpById(id);
    			
    		}
    		else if(n==4)
    		{
System.out.println("Enter Employee Id");
    			
    			int id = sc.nextInt();
    			
    			System.out.println("Enter Employee name");
    			
    			String name = sc.next();
    			
    			e.updateEmpNameById(id, name);
    		}
    		else if(n==5)
    		{
    			System.out.println("Enter Id");
    			 int id = sc.nextInt();
    			 
    			 e.deleteEmpById(id);
    		}
    		else if(n==6)
    		{  
    			System.out.println("Enter starting letter");
    			 String exp = sc.next();
    			 
    			 e.findEmp(exp);
    		}
    		else if(n==7)
    		{  
    			System.out.println("Enter 1 to sort in ASC , Enter 2 to sort in DESC");
    			
    			int x = sc.nextInt();
    			
    			e.sortEmployee(x);
    		}
    		else if(n==8)
    		{
    			System.out.println("Exit");
    			System.exit(0);
    		}
    		else
    		{
    			System.out.println("Invalid Choice");
    		}
    	}
    
        
//        String query = "select * from student";
//        
//        try
//        {
//        	Class.forName("com.mysql.cj.jdbc.Driver");
//        	connection = DriverManager.getConnection(
//        			  "jdbc:mysql://localhost:3306/temp",
//        			  "root", "imsachin@161");		
//        	
//        	Statement statement = connection.createStatement();
//        	
//        	ResultSet result = statement.executeQuery(query);
//        	
//        	while(result.next())
//        	{  
//        		String data = "";
//        		for(int i=1;i<=5;i++)
//        		{
//        			data += result.getString(i)+" | ";
//        		}
//        		System.out.println(data);
//        	}
//
//        }
//        catch(Exception e)
//        {
//        	e.printStackTrace();
//        }
    }
}
