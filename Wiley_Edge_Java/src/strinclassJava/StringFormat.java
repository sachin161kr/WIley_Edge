package strinclassJava;

import java.util.*;

public class StringFormat {

	public static void main(String[] args) {
		
		String title = "Java Developer";
		
		float salary = 2000.39f;
		
		//System.out.format("%s has salary %.2f USD", title,salary);
		
		List<String> techStack = Arrays.asList(
			    	"Essential Java",
			    	"Head First Java",
			    	"java Design Patterns"
			); 
        
			for(String book : techStack)
			{ 
				 System.out.format("%-40s  -  In Stock%n",book);
			}
 	}

}
