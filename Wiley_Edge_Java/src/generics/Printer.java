package generics;

public class Printer  <T extends Object> {
    
	T valToPrint;

	public Printer(T valToPrint) {
		this.valToPrint = valToPrint;
	}
	
	public void print()
	{
		System.out.println(valToPrint);
	}
	
}
