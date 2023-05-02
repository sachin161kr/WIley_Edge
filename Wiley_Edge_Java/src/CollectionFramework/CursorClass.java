package CollectionFramework;

import java.util.*;

public class CursorClass {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.addElement("a");
		v.addElement("a");
		v.addElement("a");
		v.addElement("a");
		v.addElement("a");
		
		Enumeration<String> ev = v.elements();
		
		ListIterator<String> itr = v.listIterator();
		
//		while(ev.hasMoreElements())
//		{
//			System.out.println(ev.nextElement());
//		}
		
		
		
		while(itr.hasNext())
		{  
			String s = itr.next(); // 1 -> 2
			itr.previous(); //  1 <- 2
			itr.set(s+s);
			System.out.println(itr.next());
		}

	}

}
