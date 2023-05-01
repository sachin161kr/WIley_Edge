package generics;

import java.util.*;

public class GenericClass {

	public static void main(String[] args) {
		
//		Printer<Integer> p1 = new Printer<>(5);
		 Printer<Double> p2 = new Printer<>(5.243);
		Printer<String> p3 = new Printer<>("Wiley Edge");
		
		Printer<Cat> c = new Printer<>(new Cat("MyCat"));
	p3.print();
	p2.print();
	
	c.print();
		
	}

}
