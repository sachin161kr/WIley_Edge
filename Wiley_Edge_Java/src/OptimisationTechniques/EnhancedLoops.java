package OptimisationTechniques;

import java.util.Arrays;

public class EnhancedLoops {

	public static void main(String[] args) {
	   
		long start = System.currentTimeMillis();
		
		int arr[] = new int[100000];
		
		Arrays.fill(arr, 1);
		
		for(int x : arr)
		{
			int n = x*1;
		}
		
		
		
		long end = System.currentTimeMillis();
		
		System.out.println(end- start);
		
     start = System.currentTimeMillis();
		
     for(int i=0;i<100000;i++)
		{
			int n = arr[i]*i;
		}
		
		end = System.currentTimeMillis();
		
		System.out.println(end- start);
		
		

	}

}
