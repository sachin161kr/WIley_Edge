package com.wiley.jdbcapp.util;

public interface EmployeeDao {
	
	public void createEmployee(Employee emp);
	
	public void getAllEmployees();
	
	public void getEmpById(int id);
	
	public void updateEmpNameById(int id,String name);
	
	public void deleteEmpById(int id);
	
	public void findEmp(String exp);
	
	public void sortEmployee(int s);

}
