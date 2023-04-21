package wiley_core_java;

class Test
{
	public static int add(int v1,int v2)
	{
		 int val = v1 + v2;
		 
		 return val;
	}
}

public class MethodTypes {

	public void sub(int v1, int v2) {
		int val = v1 - v2;

		System.out.println("Subtraction in instance method " + val);
	}

	public void add(int v1, int v2) {
		int val = v1 + v2;

		System.out.println("Additon in instance method " + val);

		this.sub(2, 3);
	}

	public static void mul(int v1, int v2) {
		int val = v1 * v2;

		System.out.println("Multiplication in Static method " + val);
	}

	public static void main(String[] args) {

		mul(2, 3);

		MethodTypes mt = new MethodTypes();

		mt.add(2, 3);
		
		int ans = Test.add(5, 5);
		
		System.out.println("Test class method "+ans);

	}

}
