package wiley_core_java;

public class ConstructorTypes {

	public ConstructorTypes(int a,int b)
	{
		System.out.println("2 args count: "+(a+b));
	}
	
	public ConstructorTypes(int a,float b)
	{
		 System.out.println("float args "+(a+b));
	}
	
	public ConstructorTypes()
	{
		System.out.println("0 args constructor");
	}
	
	public static void main(String[] args) {
		
	   ConstructorTypes ct = new ConstructorTypes(2,3.4f);
	   
	}

}
