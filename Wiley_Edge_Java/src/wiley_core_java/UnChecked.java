package wiley_core_java;

import java.util.ArrayList;

class StudentNotFound extends RuntimeException
{
	public StudentNotFound(String message)
	{
		super(message);
	}
}

public class UnChecked {

	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Venkat");
		students.add("Sachin");
		students.add("Rishav");
		students.add("Anjali");
		
		if(!students.contains("MJ"))
		{
			try {
				throw new StudentNotFound("This student does not exists");
			} catch (StudentNotFound e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		System.out.println("Last Line");
		

	}

}
