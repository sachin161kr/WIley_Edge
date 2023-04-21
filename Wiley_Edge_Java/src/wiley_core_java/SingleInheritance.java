package wiley_core_java;

class Animal
{
	  public void eat()
	  {
		  System.out.println("Animal is Eating");
	  }
	  
	  public void sleep()
	  {
		  System.out.println("Animal is Sleeping");
	  }
}

class Lion extends Animal
{  
	public void sleep()
	{
	   System.out.println("Lion is sleeping");	
	}
	 public void roar()
	 {
		  System.out.println("Lion is roaring");
	 }
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		
	  Animal a = new Animal();
	  
	  Lion l = new Lion();
	  
	  l.sleep();
	  
	  a.sleep();

	}

}
