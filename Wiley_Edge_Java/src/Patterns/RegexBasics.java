package Patterns;

import java.util.regex.*;

public class RegexBasics {

	public static void main(String[] args) {
		
		String re = "agent 0007";
		
		Pattern pattern = Pattern.compile("^[a|A]gent (\\d{3,4})$");
	
		Matcher mt =pattern.matcher("agent 0007");
		
		
		boolean result1 = mt.matches();	
		// result2 = mt.find();
		
		
		
		
		//mt.reset();
		
		//System.out.println("Found: "+result2);
		System.out.println("Match: "+result1);
	

	}

}
