import java.util.*;

public class Task1 {

	public static double calc(int sum) {

		return (double) sum * 0.10;
	}

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();

		int totalCartValue = 0;

		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();

			totalCartValue = totalCartValue + input;
		}

		if (totalCartValue >= 10000) {
			double discount = calc(totalCartValue);
			System.out.println("Total Cart Value : " + totalCartValue);
			System.out.println("Discount Applied : " + discount);
			System.out.println("Balance : " + (totalCartValue - discount));
		} else {
			System.out.println("No discount applied");
			System.out.println("Total Cart Value : " + totalCartValue);
		}

	}
}