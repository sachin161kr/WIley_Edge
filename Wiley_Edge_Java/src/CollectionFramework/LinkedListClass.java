package CollectionFramework;

import java.util.*;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ArrayList<String> names = new ArrayList<String>();
		
		Vector<String> v = new Vector<>();
		
		
long start3 = System.currentTimeMillis();
		
		for(int i=1;i<=10000000;i++)
		{
		   ll.add("Sachin");
		}
		
		long end3 = System.currentTimeMillis() - start3;
		
		System.out.println("Linkedlist "+ end3);
		
		long start1 = System.currentTimeMillis();
		
		for(int i=1;i<=10000000;i++)
		{
			names.add("Sachin");
		}
		
		long end1 = System.currentTimeMillis() - start1;
		
		System.out.println("ArrayList "+end1);
		
		
long start2 = System.currentTimeMillis();
		
		for(int i=1;i<=10000000;i++)
		{
			v.add("Sachin");
		}
		
		long end2 = System.currentTimeMillis() - start2;
		
		System.out.println("Vector "+end2);
		
		
		
	}

}
