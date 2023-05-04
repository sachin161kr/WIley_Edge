package CollectionFramework;

import java.util.*;

public class MapClass {

	public static void main(String[] args) {
		
		Map<String,String> ss = new HashMap<>();
		
		ss.put("a", "A");
		ss.put("b", "B");
		ss.put("c", "C");
		ss.put(null, null);
		ss.put("d", null);
		
		System.out.println(ss.containsKey("a"));
		
		System.out.println(ss);
		
		Map myMap = new LinkedHashMap();
		
		myMap.put(1,1);
		myMap.put("s","sachin");
		
		System.out.println(myMap);

	}

}
