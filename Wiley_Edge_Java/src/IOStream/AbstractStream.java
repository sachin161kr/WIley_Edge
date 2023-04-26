package IOStream;

import java.io.*;

public class AbstractStream {

	public static void main(String[] args) throws IOException {
		
		InputStream fin = new FileInputStream("D:\\Wiley_Edge\\LearnJava\\task5.txt");
		
		int i = 0;
		
		while((i=fin.read())!=-1)
		{
			System.out.print((char) i);
		}
		
		fin.close();

	}

}
