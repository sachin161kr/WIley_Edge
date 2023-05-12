package OptimisationTechniques;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MemoryLeak {
	
	public static void main(String[] args) {
		
		//INEFFICIANT
//		FileInputStream fis = null;
//		
//		try {
//			fis = new FileInputStream("myFile.txt");
//			// stream statements
//		}
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		finally {
//			if(fis != null) {
//				try {
//					fis.close();
//				}
//				catch(IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		
		
		// EFFICIANT
		try(FileInputStream fis = new FileInputStream("myFile.txt")){
			// LOGIC
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
