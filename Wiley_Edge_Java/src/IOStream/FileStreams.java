package IOStream;

import java.io.*;

public class FileStreams {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("D:\\Wiley_Edge\\LearnJava\\task5.txt");

	   String str = "Wiley Fullstack project";
		
		byte[] b = str.getBytes();
		
		fout.write(b);
		
		fout.flush();
		
		fout.close();
		
		FileInputStream fin = new FileInputStream("D:\\Wiley_Edge\\LearnJava\\task5.txt");
		
		try {
			int content;
            // reads a byte at a time, if it reached end of the file, returns -1
            while ((content = fin.read()) != -1) {
                System.out.print((char)content);
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		fin.close();
				
	}

}
