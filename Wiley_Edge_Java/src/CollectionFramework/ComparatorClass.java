package CollectionFramework;

import java.util.*;

public class ComparatorClass {
	
	public boolean comp(Integer Obj1, Integer Obj2)
	{
		if(Obj1 < Obj2)
		{
			return true;
		}
		
		return false;

	}

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(3);
		
		ts.add(4);
		
		System.out.println(ts);

	}

}
