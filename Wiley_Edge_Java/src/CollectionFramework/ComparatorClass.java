package CollectionFramework;

import java.util.*;

class StudentSort implements Comparable<StudentSort>
{
	String name;
	int marks;
	
	public StudentSort(String name,int marks)
	{ 
		 this.name = name;
		 this.marks = marks;
	}

	@Override
	public int compareTo(StudentSort o) {
		
		if(this.marks == o.marks)
		{
			  if(this.name.compareTo(o.name)>0)
			  {
				   return 1;
			  }
			  else if(this.name.compareTo(o.name)<0)
			  {
				  return -1;
			  }
			  
			  return 0;
		}
		else if(this.marks < o.marks)
		{
			return 1;
		}
		
		return -1;
		
	}
	
}

class Sort implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1 < o2) return -1;
		if(o2 < o1) return 1;
		
		return 0;
		
	}
	
}

public class ComparatorClass {

	public static void main(String[] args) {
		
		ArrayList<StudentSort> arr = new ArrayList<>();
		
		arr.add(new StudentSort("Sachin",21));
		arr.add(new StudentSort("Kritika",21));
		arr.add(new StudentSort("Monu",19));
		
		Collections.sort(arr);
		
		arr.forEach(e -> System.out.println(e.name+" has "+e.marks));
	}

}
