package lambda;

interface Add{
	 public void print();
}

public class PracticeLambda {

	public static void main(String[] args) {
		
	   int a = 5;
	   
	   int b = 6;
	   
	   Add p = ()->{System.out.println("Hello World");};
	   
	   p.print();

	}

}
