package wiley_core_java;

abstract class Vehicles {
	protected String color;
	protected int speed;
	protected int wheels;

	public Vehicles(String color, int speed, int wheels) {
		this.color = color;
		this.speed = speed;
		this.wheels = wheels;
	}
	
	public abstract void move();
	
}

class CarFromVehicles extends Vehicles 
{

	public CarFromVehicles(String color, int speed, int wheels) {
		super(color, speed, wheels);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		
		System.out.println("Car is moving");
		
	}
	
	public void turn()
	{
		System.out.println("Turning Left or Right...");
	}
	
}

public class ClassAbstract {

	public static void main(String[] args) {
		
		
		CarFromVehicles c = new CarFromVehicles("red",20,4);
		
		c.move();
		c.turn();

	}

}
