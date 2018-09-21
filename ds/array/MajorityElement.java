import java.util.*;
import java.lang.*;
import java.io.*;

class MajorityElement {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t; i++)
		{
		    
		    int n = scan.nextInt();
		    int Majority_Element;
		    int [] a = new int [n]; 

		    for(int j = 0; j<n; j++)
		    {
		        a[j] = scan.nextInt();
		    }
		    for(int j = 0; j<=n/2; j++)
		    {
		    	int counter = 0;
			for(int k = 0; k<n; k++)
		    	{
				if(Majority_Element!=a[k])
				{
					if(a[j]==a[k])
					counter++;
				}
			}
			if(counter>n/2)
				Majority_Element=a[j];
		    }
		}
			
	}
}
