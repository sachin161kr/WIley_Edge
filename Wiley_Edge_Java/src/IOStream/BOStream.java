package IOStream;

import java.io.*;

public class BOStream {

	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fout = new FileOutputStream("D:\\Wiley_Edge\\LearnJava\\data.txt");
//		BufferedOutputStream bof = new BufferedOutputStream(System.out);
//		
//		String str = "I am a programmer";
//		
//		byte[] b = str.getBytes();
//		
//		try {
//			bof.write(b);
//			fout.write(b);
//			bof.flush();
//			bof.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		FileInputStream fin = new FileInputStream("D:\\\\Wiley_Edge\\\\LearnJava\\\\data.txt");
		
		BufferedInputStream bis = new BufferedInputStream(fin);
		
		int i;
		
			while((i=bis.read())!=-1)
			{
				System.out.println((char) i);
			}
			
			bis.close();
			
			fin.close();
			
	}

}
