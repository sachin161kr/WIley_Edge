package wiley_core_java;

public class VarScope {

	int ins = 20;
	
	int val = 10;
	
	int val1 = 12;
	
	static String name = "Sachin";
	
	public void add()
	{
		int val = 10;
		int val1 = 25;
		
		System.out.println(this.val+this.val1);
	}
	
	public static void main(String[] args) {
		
		int val = 10;
		
		VarScope vso = new VarScope();
		
		int loc = 10;
		
		System.out.println("local "+loc);
		
		System.out.println("ins "+ vso.ins +" "+ name);
		
		System.out.println("local int " + val);
		
		vso.add();

	}

}
