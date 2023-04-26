package Random;

import java.util.*;
import java.text.*;

public class CurrencyClass {

	public static void main(String[] args) {
		
		NumberFormat numFormat1= NumberFormat.getCurrencyInstance(Locale.US);
		String usdValue = numFormat1.format(108.5);
		
		System.out.println(usdValue);
		
		NumberFormat numFormat2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String inrValue = numFormat2.format(100);
		System.out.println(inrValue);
		
		double price = 2000.25;
		
		DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");
		
		decimalFormatter.setPositivePrefix("$");
		
		String resVal = decimalFormatter.format(price);
		
		System.out.println("Custom Format : "+resVal);
		
		Currency cur = Currency.getInstance("USD");
		
		String symbol = cur.getCurrencyCode();
		
		System.out.println(symbol);
		
		
		
		
		

	}

}
