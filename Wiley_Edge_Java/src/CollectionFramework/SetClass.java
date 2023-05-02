package CollectionFramework;

import java.util.*;

public class SetClass {

	public static void main(String[] args) {
		
		SortedSet<Integer> st = new TreeSet<>();
		
		
		st.add(-1);
		
		st.add(1);
		
		System.out.println(st.headSet(3));
		
		System.out.println(st.tailSet(1));
	  
	  System.out.println("hello");
	  System.out.println(st.first().compareTo(st.last()));
		
		
	
		
		HashSet<String> hs = new HashSet<>();
		
		// LinkedHashet follows inserting order
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		Set<String> ts = new TreeSet<>();
		
		hs.add("Java");
		
		hs.add("java");
		
		hs.add("java");
		
		hs.add("python");
		
		hs.add("javaScript");
		
		hs.add("mySql");
		
		ts.add("b");
	
		
		ts.add("a");
		
		ts.add("c");
		
		
		System.out.println(hs);
		
		System.out.println(ts);
		
		lhs.add("Sachin");
		
		lhs.add("Venkat");
		
		lhs.add("nothing");
		
		System.out.println(lhs);
		

	}

}
