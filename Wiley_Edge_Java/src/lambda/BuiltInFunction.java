package lambda;

import java.util.*;
import java.util.function.Function;

public class BuiltInFunction {

	private static HashMap<Integer,String> Employee = new HashMap<>();
	
	public static void add(String name,int ID)
	{
		if(!Employee.containsKey(ID))
		{
			Employee.put(ID, name);
		}
		else
			System.out.println("Employee Already Exists");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,String> get = (Integer ID) -> {
			if(Employee.containsKey(ID)) return Employee.get(ID);
			else return "INVALID ID";
		};
		
        add("Sachin",12);
        add("Janavi",21);
        add("Kritika",5);
        
        
        System.out.println("NAME = "+get.apply(12));
	}

}
