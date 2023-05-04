package CollectionFramework;

import java.util.*;

public class TreeMapClass {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		
		tmap.put(1000, "Venkat");
		tmap.put(3000, "rishav");
		tmap.put(2000, "Janavi");
		tmap.put(1000, "shivam");
		
		System.out.println(tmap);
		
		tmap.forEach((k,v) -> System.out.println("key: "+k+" val : "+v));
		
		System.out.println(tmap.lastKey());
		System.out.println(tmap.firstKey());
		
		Set<Integer> keysLessthan = tmap.headMap(3000).keySet();
		Set<Integer> keysMorethan = tmap.tailMap(3000).keySet();
		
		System.out.println(keysLessthan);
		System.out.println(keysMorethan);
		
		List<Integer> l = new ArrayList<>();
		
		
		
		HashSet<Integer> hs = new HashSet<>();
		
		// 1 2 3 1 1 5 
		
		// 4,72,23,66,48,28,69,64,52,13,696 // 22 // 10^8 / sec
		
		// 
		
		// add unique elements
		
		
		
//		l = new ArrayList<>();
//		
//		l.add(3); // 3
//		
//		System.out.println(l) ;// 0 , 3
//		
//		l.set(0, 4); // 4
//		
//		System.out.println(l);
		
		
	}

}
