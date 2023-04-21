package wiley_core_java;

class Vehicle
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

class MyCar extends Vehicle
{
	public void horn()
	{
		System.out.println("Horn");
	}
}

class SmartCar extends MyCar
{
	public void sensor()
	{
		System.out.println("sensor");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		
		 SmartCar sc = new SmartCar();

		 sc.sensor(); 
		 sc.airBag();
		 
		 sc.horn();

	}

}
