package wiley_core_java;

class Car {
	int tyre;
	String color;

	void move() {
		System.out.println("Car is Moving");
	}
}

public class Oops1 implements Cloneable{
  
	public void moveFast()
	{
		System.out.println("Clonable");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {

		// Create Object with new Keyword
		Car c1 = new Car();

		c1.move();

		System.out.println(c1);

		// Create Object with new instance

		try {
			Class c = Class.forName("wiley_core_java.Car");

			Car cl = (Car) c.newInstance();

			System.out.println(cl);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 
		
		Oops1 obj = new Oops1();
		
		Oops1 obj2 = (Oops1) obj.clone();
		
		System.out.println(obj2);
		
		obj2.moveFast();

	}

}
