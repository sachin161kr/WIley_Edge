package lambda;

import java.util.function.Supplier;

public class BuiltInSupplier {

	public static void main(String[] args) {
		
		Supplier<String> msg = () -> "Happy Bday";
		
		System.out.println(msg.get());

	}

}
