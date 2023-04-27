package SerializableConcepts;

import java.io.*;

public class SerializableObj {

	public static void main(String[] args) {
		
		Book b1 =  new Book(108,"Java Essentials");
		
		try {
			FileOutputStream fos = new FileOutputStream("book.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(b1);
			
			fos.close();
			System.out.println("Task Completed");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}