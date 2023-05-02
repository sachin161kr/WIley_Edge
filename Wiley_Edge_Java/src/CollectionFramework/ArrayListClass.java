package CollectionFramework;

import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		
		a1.add(3);
		a1.add(2);
		
		
		ArrayList<Integer> a2 = new ArrayList<>();
		
		a2.remove(0)
		
		for(int i=a1.size()-1;i>=0;i--)
		{
			 System.out.println(a1.get(i));
		}
		
	   Iterator<Integer> it = a1.iterator();
	   
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }

	}

}
