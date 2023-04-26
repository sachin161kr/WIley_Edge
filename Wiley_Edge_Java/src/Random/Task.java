package Random;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double input = sc.nextDouble();
		
		double er1 = 81.72;
		
		double er2 = 0.90;
		
		double inr = input*er1;
		
		double eur = input*er2;
		
		System.out.printf(input+" USD in INR = %.2f",inr);
		System.out.println();
		System.out.printf(input+" USD in EURO = %.2f",eur);

	}

}
