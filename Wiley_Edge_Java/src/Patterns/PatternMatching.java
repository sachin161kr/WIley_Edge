package Patterns;


import java.util.regex.*;

public class PatternMatching {

	public static void main(String[] args) {
		
		String input = "The key to LEARN programming is consistent practise";
		
		Pattern pattern = Pattern.compile("learn",Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher(input);
		
		System.out.println(matcher.find());
		
		matcher.reset();
		
		if(matcher.find())
		{  
			int start = matcher.start();
			int end = matcher.end();
			
			System.out.println(start+" "+end);
			
		}

	}

}
