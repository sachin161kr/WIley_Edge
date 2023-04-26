package IOStream;

import java.io.*;

public class CharacterStreamClass {

	public static void main(String[] args) throws IOException {
		
		Writer out = new OutputStreamWriter(System.out);
		
		Writer fw = new FileWriter("D:\\Wiley_Edge\\LearnJava\\AbstractStream.txt");
	   
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("I like programming, what to do");
		
		bw.flush();
		
		bw.close();
        
		fw.close();
		
		Reader in = new InputStreamReader(System.in);
		
		Reader fr = new FileReader("D:\\Wiley_Edge\\\\LearnJava\\AbstractStream.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		int i = 0;
		
		while((i = br.read())!=-1)
		{
			System.out.print((char) i);
		}
		
		br.close();
		
		fr.close();
	}

}
