package assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiAssignment {

	public static void main(String[] args) {
		
	// Created a StudentsClass and Implemented Comparable Interface	
		
	// Created a list of students	
		
	StudentsClass [] arr = new StudentsClass[7];
	
	arr[0] = new StudentsClass(1,"Sachin",20,'A');
	arr[1] = new StudentsClass(2,"Janavi",22,'A');
	arr[2] = new StudentsClass(3,"Kritika",19,'A');
	arr[3] = new StudentsClass(4,"Krishna",18,'B');
	arr[4] = new StudentsClass(5,"Faizan",20,'A');
	arr[5] = new StudentsClass(6,"Anjali",18,'B');
	arr[6] = new StudentsClass(7,"Muskan",19,'A');

	List<StudentsClass> list = Arrays.asList(arr);
	
	
	//  Applied Stream Api to sort and limit the number of students
	
	List<StudentsClass> filteredList = list.stream().sorted().limit(5).collect(Collectors.toList());
	
	for(int i=0;i<filteredList.size();i++)
	{
		System.out.println(filteredList.get(i).name);
	}
	
	}

}
