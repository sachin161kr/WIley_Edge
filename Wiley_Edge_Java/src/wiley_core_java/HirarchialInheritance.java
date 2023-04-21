package wiley_core_java;

class Vehicle1
{
	public void tier()
	{
		System.out.print("Tier");
	}
	
	public void steering()
	{
		System.out.println("streering");
	}
	
	public void airBag()
	{
		System.out.println("airbag");
	}
}

class Car1 extends Vehicle1
{
	public void horn()
	{
		System.out.println("Horn");
	}
}

class Truck extends Vehicle1
{
	public void HydraulicPump()
	{
		System.out.println("HydraulicPump");
	}
}

public class HirarchialInheritance {

	public static void main(String[] args) {
		 
		Car1 c = new Car1();
		
		Truck t = new Truck();

	}

}
