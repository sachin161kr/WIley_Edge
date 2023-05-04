package CollectionFramework;

import java.util.*;

public class CustomArrayList extends ArrayList {
	
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}
		else {
			return super.add(o);
		}
	}
	
	public static void main(String[] args) {
//		CustomArrayList list = new CustomArrayList();
//		
//		list.add(1);
//		list.add(2);
//		list.add(1);
//		list.add(4);
//		list.add(3);
//		list.add(6);
//		list.add(6);
//		
//		System.out.println(list);
		
		
		
		List<GeniusStudent> setStudent = new ArrayList<>();
		
		GeniusStudent gst1 = new GeniusStudent(101, "Sir",10.2f);
		GeniusStudent gst2 = new GeniusStudent(101, "Rishav",22.3f);
		GeniusStudent gst3 = new GeniusStudent(103, "Steve",99.2f);
		
		setStudent.add(gst1);
		setStudent.add(gst2);
		setStudent.add(gst3);
		
		//Collections.sort(setStudent);
		Collections.sort(setStudent,new MoneyComparator());
		
		System.out.println(setStudent);
	}

}
