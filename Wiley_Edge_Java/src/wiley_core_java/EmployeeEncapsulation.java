package wiley_core_java;

class Employee 
{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		 this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
}

class Employee1 
{
	 public void show(Employee e)
	 {
		  System.out.println("Name: "+e.getName()+" Age: "+e.getAge());
	 }
}

public class EmployeeEncapsulation {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setName("Wiley");
		emp.setAge(22);
		
		System.out.println("Name: "+emp.getName());
		System.out.println("Age: "+emp.getAge());
		
		Employee1 emp1 = new Employee1();
		
		emp1.show(emp);
				;

	}

}
