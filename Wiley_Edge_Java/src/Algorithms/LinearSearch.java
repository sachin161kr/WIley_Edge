package Algorithms;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
        	arr[i] = sc.nextInt();
        	
        }
        
        int x = sc.nextInt();
        
      int index = linearSearch(arr,x);
        
        if(index == -1)
        {
        	System.out.println("Element not found");
        }
        else
        {
        	 System.out.print("element "+x+" found at index "+index);
        }

	}

}
