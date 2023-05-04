package CollectionFramework;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {

	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("a");
		list.add("b");
		//       i      i
		// a b c   
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			
			itr.next();
			
			list.add("c");
	
		}
		
		System.out.println(list);

	}

}
