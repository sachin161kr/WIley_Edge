package wiley_core_java;

interface Bank
{
	void account();
}

interface Bank1
{
	void account();
}

interface ATM extends Bank , Bank1{
	void insertCard();
	void selectOption();
   void enterPassword();
};

interface AA 
{
	void m1();
}

abstract class NewATM implements ATM,AA 
{

	@Override
	public void account() {
		
		System.out.println("account");
		
	}

	@Override
	public void m1() {
		
		System.out.println("m2");
		
	}
	
}

public class InterfaceBank  extends NewATM{

	
	
	public static void main(String[] args) {
		
	   	

	}

	@Override
	public void insertCard() {
		
		System.out.println("Insert Card");
		
	}

	@Override
	public void selectOption() {
		
		System.out.println("Select Option");
		
	}

	@Override
	public void enterPassword() {
	
		System.out.println("Enter Password");
		
	}

}
