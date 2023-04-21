package wiley_core_java;

public class InstanceOrder {

	String name;
	int age;
	
	{
		name = "Sachin";
		age = 22;
		System.out.println("Instance Block");
	}
	
	public InstanceOrder()
	{
		System.out.println("Name: "+name+" Age: "+age);
		System.out.println("Constructor Block");
	}
	
	public InstanceOrder(int a,int b)
	{
		System.out.println("Constructor Parameterised "+(a+b));
	}
	
	public static void main(String[] args) {
		
		InstanceOrder io = new InstanceOrder();
		
		 new InstanceOrder(2,3);

	}

}
