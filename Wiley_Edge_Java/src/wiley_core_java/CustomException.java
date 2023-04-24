package wiley_core_java;

class AgeNotValid extends Exception
{
	public AgeNotValid(String message)
	{
		super(message);
	}
	
	public String getMessage() {
		return "this age is not valid";
	}
	
	public String toString()
	{
		return "age not applicable";
	}
}


public class CustomException {

	public static void getAge(int age) throws AgeNotValid
	{
		if(age > 18)
		{
			
			try {
				//throw new Exception("age not valid");
				throw new AgeNotValid("age not valid");
			} catch (Exception e) {
			   
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
	}
	
	
	
	public static void main(String[] args) throws AgeNotValid 
	{
		
		getAge(22);
		
		System.out.println("Last line");

	}

}
