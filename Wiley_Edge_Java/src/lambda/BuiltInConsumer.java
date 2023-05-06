package lambda;

import java.util.function.BiConsumer;

public class BuiltInConsumer {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> el = (Integer age,Integer percent) -> {	
			
			if(age>18 && percent > 75)
			{
			   System.out.println("You are eligible for the job");	
			}
			else
			{
				System.out.println("Your are not eligible");
			}
		};
		
		el.accept(20, 100);
		
	}

}
