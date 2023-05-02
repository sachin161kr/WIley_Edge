package CollectionFramework;

import java.util.*;

public class Task_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Event1");
		
		arr.add("Event2");
		
		arr.add("Event2");
		
		arr.add("Event3");
		
		arr.add("Event3");
		
		arr.add("Event4");
		
		HashSet<String> hs = new HashSet<>();
		
		hs.addAll(arr);
		
		
		
		System.out.println(hs);
		
		

	}

}
