package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static int fib(int n,int dp[])
	{
		if(n==0 || n==1)
		{
			return n;
		}
		
		if(dp[n]!=-1)
		{
			return dp[n];
		}
		
		return dp[n] = fib(n-1,dp) + fib(n-2,dp);
		
	}
	
	public static void main(String[] args) {

		int dp[] = new int[10000];

		Arrays.fill(dp, -1);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		fib(n,dp);
		
		System.out.print(dp[n]);

	}

}
