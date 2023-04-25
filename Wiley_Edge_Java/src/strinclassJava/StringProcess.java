package strinclassJava;

public class StringProcess {

	public static void main(String[] args) {
		
	   System.out.println(Math.PI);
		
		String s1 = "Wiley";
		
		String s2 = "Wiley";
		
		String s3 = new String("Wiley");
		
		String s4 = new String("Wiley");
		
		String s5 = s4;
		
		System.out.println(s4==s5);
		
		
		String str = "I am a java developer";
		
		String str1 = "Python";
		
		System.out.println(str.charAt(10));
		
		String s = (str.replace('D', 'd'));
	
		
		String st[] = s.split("");
		
		for(String si : st)
		{
			System.out.println(si);
		}
		
		String s6 = " Mathsss";
		
		System.out.println(s6.trim());
		
		
	
		

	}

}
