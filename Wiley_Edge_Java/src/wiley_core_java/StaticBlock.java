package wiley_core_java;

public class StaticBlock {

	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public StaticBlock()
	{
		System.out.println("Constructor Block");
	}
	
	public static void main(String[] args) {
		
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
		
	}

}
