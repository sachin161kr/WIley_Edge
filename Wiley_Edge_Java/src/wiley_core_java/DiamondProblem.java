package wiley_core_java;

interface Person
{
	public void getRole();
}

interface Student extends Person{};

class Teacher implements Person{
	
	public void getRole() {
	     System.out.println("Teaching");       
	}
}

class ClassRoom extends Teacher implements Student
{
	public void getRole()
	{
		System.out.println("ClassRoom is Teaching");
	}
}


public class DiamondProblem {

	public static void main(String[] args) {
		
         Teacher t = new Teacher();
         
         t.getRole();
         
         ClassRoom cr = new ClassRoom();
         
         cr.getRole();
	}

}
