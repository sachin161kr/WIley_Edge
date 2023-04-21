package wiley_core_java;

class Human
{
	public void eat()
	{
		System.out.println("Human is eating");
	}
}

class Man extends Human
{
	public void eat()
	{
		System.out.println("Man is eating");
	}
}

public class Polymorphism {

	public static void print()
	{
		System.out.println("No parameters");
	}
	
	public static void print(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
	    
		 print();
		 print("Sachin");
		 
		 Man m = new Man();
		 
		 m.eat();
		 
		 Human h = new Human();
        
		 h.eat();
	}

}
