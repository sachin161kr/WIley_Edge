package lambda;



public class LambdaClass implements Printable {
	
	
	
	public static void main(String[] args) {
      
		System.out.println("Hello world");
		
	   Printable ad = ()->{System.out.println("Hello Add");};
	 
	   ad.add();
	   
	}

	@Override
	public void add() {
		
		System.out.println("Hello addddd");
		
	}
	

}
