package lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BIFunctionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		UnaryOperator<Integer> n = (a) -> a^1;
//		
//		System.out.println(n.apply(0));
		
		BinaryOperator<Integer> m = (a,b) -> a & b;
		
		System.out.println(m.apply(10, 5));
		
		// 1010
		// 0101

	}

}
