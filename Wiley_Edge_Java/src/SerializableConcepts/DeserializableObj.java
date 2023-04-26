package SerializableConcepts;

import java.io.*;

public class DeserializableObj {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("books.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Book b = (Book)  ois.readObject();
			
			System.out.println("Book Code: "+b.bookCode);
			System.out.println("Book Name "+b.bookName);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
