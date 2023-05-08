package DataStructures;

import java.util.Scanner;

public class StackClass {
	
	private int arr[];
	
	private int top;
	
	private int capacity;
	
	StackClass(int size)
	{
		top = -1;
		
		arr = new int[size];
		
		capacity = size;
	}
	
	public void peek()
	{ 
		if(isEmpty()==true)
		{
			 System.out.println("Stack is empty");
			 return;
		}
		System.out.println(arr[top]);
	}
	
	public boolean isFull()
	{
		if(top >= capacity)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isEmpty()
	{
		if(top<0)
		{
			return true;
		}
		
		return false;
	}
	
	public void push(int x)
	{
		if(!isFull())
		{
			top++;
			 
			 arr[top] = x;
			 
			 System.out.println("Pushed "+x+" to "+top);
		}
		else
		{
			System.out.println("Stack is full");
		}
		
		
	}
	
	public void pop()
	{   
		if(isEmpty()==false)
		{
			System.out.println("poped "+arr[top]);
			top--;
		}
	}
	
	void print()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return;
		}
		int i = top;
		
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		StackClass st = new StackClass(n);
		
		

	}

}
