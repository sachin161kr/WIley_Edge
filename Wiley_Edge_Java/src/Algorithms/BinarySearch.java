package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Pair
{
	int index;
	int count;
	
	Pair(int index,int count)
	{
		this.index = index;
		this.count  = count;
	}
}

public class BinarySearch {
	
	public static Pair binarySearch(int arr[],int x)
	{ 
		int count= 0;
		int s = 0;
		int e = arr.length-1;
		
	    while(s<=e)
	    { 
	    	int mid = s + (e-s)/2;
	    	count++;
	    	//System.out.println(mid);
	    	
	    	if(arr[mid]==x)
	    	{
	    		return new Pair(mid,count);
	    	}
	    	else if(arr[mid]<x)
	    	{
	    		s = mid + 1;
	    	}
	    	else
	    	{
	    		e = mid -1;
	    	}
	    }
	    
	    return new Pair(-1,0);
		
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
        
        Pair p = binarySearch(arr,x);
        
        if(p.index == -1)
        {
        	System.out.println("Element not found");
        }
        else
        {
        	 System.out.print("element "+x+" found at index "+p.index+" in "+p.count+" comparision(s)");
        }

       
	}

}
