package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
		
		int req = 18;
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = 0;
		while(sum<req)
		{
			sum = sum + arr[i];
			ans.add(arr[i]);
			i++;
		}
		
		for(int i=0;i<ans.size();i++)
		{
			
		}

	}

}
