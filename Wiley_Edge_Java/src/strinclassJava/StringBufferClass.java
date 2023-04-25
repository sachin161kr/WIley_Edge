package strinclassJava;

public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Wiley");
		StringBuffer sb1 = new StringBuffer("Wiley");
		StringBuffer sb2 = new StringBuffer("Wiley");
		
		String s = "Wiley";
		
		System.out.println(s.equals(sb1.toString()));
		
		
		sb.insert(5, " Edge");
		
		System.out.println(sb);
		
		
		System.out.println(sb.delete(0, 5));
		
		System.out.println(sb.reverse());
		
		
		
	}

}
