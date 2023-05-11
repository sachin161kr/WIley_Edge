package Algorithms;

import java.util.Scanner;

public class Hashing {

	static int arr[] = new int[10];
	
    static int hashFun(int x)
    {
    	 return x % 11;
    }	
 	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n-- > 0)
		{  
			int x = sc.nextInt();
			 int index = hashFun(x);
			 
			 arr[index]  = x;
			 
			 System.out.println(x+" element is at hash index "+index);
			 
		}

//		for(int e : arr)
//		{
//			System.out.print(e+" ");
//		}
//		
//		System.out.println();
	}

}
