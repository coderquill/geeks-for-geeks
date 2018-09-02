/*
Input:

The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of three lines. The first line of each test case consists of an integer N, where N is the size of array.
The second line of each test case contains N space separated integers denoting array elements. The third line of each test case contains "d" .

Output:

Corresponding to each test case, in a new line, print the modified array.

Constraints:

1 ≤ T ≤ 200
1 ≤ N ≤ 200
1 ≤ A[i] ≤ 1000

Example:

Input

1
5
1 2 3 4 5
2

Output
3 4 5 1 2
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Arrayrotate2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i < t; i++)
		{
    		int n = scan.nextInt();
    		int[] array = new int[n];
    		for(int k = 0; k < n; k++)
		    {
    		    array[k]=scan.nextInt();
		    }
		    int key = scan.nextInt();
		    
		    for( int j = 0; j < n; j++)
		    {
		        
		        int temp = j - key;
		        if (temp < 0)
		        {
		            temp = n + temp; 
		        }
		        array[temp] = array[j];
		    }
		    
		    for(int k = 0; k < n; k++)
		    {
    		    System.out.print(array[k]+" ");
		    }
		    System.out.println();
		}
	}
}
