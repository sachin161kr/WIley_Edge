package CollectionFramework;

import java.util.*;
import java.util.concurrent.*;

public class FailSafeClass {

	public static void main(String[] args) {
		
		//Map<Integer,String> myMap = new HashMap<Integer,String>();
		Map<Integer,String> myMap = new ConcurrentHashMap<Integer,String>();
		myMap.put(1, "java");
		myMap.put(2, "python");
		
		Iterator it = myMap.keySet().iterator();
		
		while(it.hasNext())
		{
			Integer key = (Integer) it.next();
			System.out.println(key+" "+myMap.get(key));
			myMap.put(3, "react");
		}

		System.out.println(myMap);
	}

}
