package wiley_core_java;

public class ExceptionalHandling {

	public static void main(String[] args) {
		
		System.out.println("First Statement");
		
		int arr[] = {1,2,3,4};
		
		try
		{
			System.out.println(arr[1]);
			System.out.println(arr[3]);
			
			System.out.println("Simple statement 2");
	
			String str = "Venkat";
			
			System.out.println(str.charAt(4));
			
			System.out.println(12/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{  
			  System.out.println(e.getMessage());
			  System.out.println(e.toString());
			  e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Catch block 2");
			e.printStackTrace();
		}
		catch(Exception e)
		{ 
			System.out.println("catch block 3");
			e.printStackTrace();
		}
		
		System.out.println("Another Statement");
	}

}
