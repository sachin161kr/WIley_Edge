package IOStream;

import java.io.*;

public class DataStreamClass {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("D:\\Wiley_Edge\\LearnJava\\data2.txt");
		
		DataOutputStream dos = new DataOutputStream(fout);
		
		dos.writeBytes("I am a programmer, I am writing this file");
		
		dos.flush();
		
		dos.close();
		
		FileInputStream fin = new FileInputStream("D:\\Wiley_Edge\\LearnJava\\data2.txt");
		
		DataInputStream dis = new DataInputStream(fin);
		
		int count = fin.available();
		
		byte[] ba  = new byte[count];
		
		dis.read(ba);
		
		for(byte b : ba)
		{
			System.out.println((char) b);
		}
		
		dis.close();
		fin.close();
		
		
        
	}

}
