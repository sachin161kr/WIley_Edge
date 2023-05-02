package CollectionFramework;

class Student{};

public class CollectionNeed {

	public static void main(String[] args) {
		
		// limitation of array
		// 1. fixed in size
		// 2. Arrays can hold only homogeneous data elements
		
		Student[] students = new Student[10];
		
		students[0] = new Student();
		students[1] = new Student();
		
		Object[] objects = new Object[10];
		
		objects[0] = new Student();
		objects[1] = new Student();
		
		// 3. Ready made API's support is not available in array
		

	}

}
