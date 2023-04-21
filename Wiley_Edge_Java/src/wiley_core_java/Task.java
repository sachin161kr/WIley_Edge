package wiley_core_java;

class A
{
      public void prop1()
      {
    	   System.out.println("Class A");
      }
}

class B extends A
{
	 public void prop2()
     {
   	   System.out.println("Class B");
     }
}

class C extends A
{
	public void prop3()
    {
  	   System.out.println("Class C");
    }
}

class D extends B
{
	public void prop4()
    {
  	   System.out.println("Class D");
    }
}

class E extends D
{
	public void prop5()
    {
  	   System.out.println("Class E");
    }
}

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		E e = new E();
		
		e.prop1();
		e.prop2();
		e.prop4();
		e.prop5();
		
	}

}
