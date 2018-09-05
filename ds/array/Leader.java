/*
Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print all the leaders.

Constraints:
1 <= T <= 100
1 <= N <= 107
0 <= Ai <= 1018

Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Leader 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for( int i = 0; i < t; i++)
		{
			int n = scan.nextInt();

		        int [] array = new int [n]; 
			
		        for( int j = 0; j < n; j++)
		        {
				array[j]= scan.nextInt();
		        }
			
			for( int f = 0; f<n; f++)
			{
				int j = f+1;
				while (j<n)
				{
					if(array[f]>=array[j])
						j++;
					else
						break;
				}
				if(array[f]==array[n-1] || j==n )	
					System.out.print(array[f]+" ");
			}
			System.out.println();
		}
		
	}
}
			
			
		    
		
