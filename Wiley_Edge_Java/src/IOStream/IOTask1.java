package IOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.*;

public class IOTask1 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
FileOutputStream fout = new FileOutputStream("D:\\Wiley_Edge\\LearnJava\\task3.txt");
		
		DataOutputStream dos = new DataOutputStream(fout);
		
	   int n = 5;
	   
	   while(n>0)
	   {    
		   String name = "Sachin";
		   int age = 22;
		 
		   char gender = 'M';
		  
		   char grade ='A';
		   
		   dos.writeBytes("Name : "+name+" age : "+age+" gender : "+gender+" grade : "+grade+"\n");
			
			dos.flush();
		   
		   n--;
	   }

	}

}
