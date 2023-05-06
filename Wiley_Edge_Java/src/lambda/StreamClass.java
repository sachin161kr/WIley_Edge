package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
//		List<Integer>  number = Arrays.asList(4,1,3,2);
//		
//		Stream<Integer> filteredData = number.stream().filter(x -> x%2==0);
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		  
	    // demonstration of map method
	    List<Integer> square = number.stream().filter(x -> (x % 2) ==0).
	                           collect(Collectors.toList());
	    
	    System.out.println(square);
          
          
	}

}
