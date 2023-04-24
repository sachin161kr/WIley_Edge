package wiley_core_java;

public class FinalBlock {

	public static void main(String[] args) {
		
		try {
			System.out.println("11111");
			System.out.println("Wiley");
			System.out.println(12/0);
			System.out.println("Edge");
		} catch (Exception e) {
			try {
				System.out.println("catch block");
				System.out.println(12/0);
				e.printStackTrace();
			} catch(Exception er) {
				//er.printStackTrace();
			}
			finally {
				System.out.println("nested finally block");
			}
		}
		finally {
			//System.out.println(12/0);
			System.out.println("Close Connection");
		}
		
		System.out.println("Last statement");

	}

}
