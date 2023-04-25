package strinclassJava;

import java.util.*;

public class StringTokenClass {

	public static void main(String[] args) {
		
	  StringTokenizer st = new StringTokenizer("We love java programming");
	 
	  ArrayList<StringBuffer> arr = new ArrayList<>();
	  
	  for(int i=0;i<5;i++)
	  {
		  StringBuffer s = new StringBuffer("Hey");
		  arr.add(s);
	  }
	  
	  for(StringBuffer it : arr)
	  {
		  System.out.println(it);
	  }
	  
	  System.out.println(st.countTokens());
	  
	  while(st.hasMoreElements())
	  {
		  System.out.println(st.nextToken());
	  }

	}

}
