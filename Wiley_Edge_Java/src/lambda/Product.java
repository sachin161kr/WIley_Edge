package lambda;

public class Product implements Printable {

	String name;
	int pid;
	
	public Product()
	{
		
	}
	
	@Override
	public void print(String s) {
		
		System.out.println("This is a product class that implements printable interface");
		
	}

}
