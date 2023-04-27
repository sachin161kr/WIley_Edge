package Patterns;

import java.util.regex.*;

public class CreditCardMatch {

	public static void main(String[] args) {
		
		String cardNumber = "4520-4678-5623-0200";
		
		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		
		Matcher matcher = pattern.matcher(cardNumber);
		
	    String maskedCard =	matcher.replaceAll("xxxx-xxxx-xxxx-");
		
		System.out.println(maskedCard);
	}

}
