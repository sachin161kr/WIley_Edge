package wiley_core_java;

abstract class Test1
{
	{
		System.out.println("Instance block Test1");
	}
	
	static
	{
		System.out.println("Static block Test1");
	}
	public abstract void m1();
	
	public static void main()
	{
		System.out.println("Test1 main method");
	}
	
	public void m2()
	{
		System.out.println("Test1 m2 method");
	}
	
	public Test1()
	{
		System.out.println("Test1 constructor");
	}
}

class Test2 extends Test1
{
  
	{
		System.out.println("Instance block Test2");
	}
	
	static
	{
		System.out.println("Static block Test2");
	}
	
	@Override
	public void m1() {
		
		System.out.println("Test 2 m1 method");
		
	}
	
	public Test2()
	{
		System.out.println("Test2 constructor");
	}
	
}

public class AbstractionClass {

	public static void main(String[] args) {
        
		 Test2 t2 = new Test2();
		 
		 Test1.main();
		  
		 t2.m1();
		 t2.m2();
	

	}

}
