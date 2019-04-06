/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Kadane
{
    static int max_all=Integer.MIN_VALUE;
	public static void main (String[] args)
	{
	    int i,j,k,T,sum,length,temp;
	    int loc_i,loc_j;
	    int a[];
	    Scanner sc=new Scanner(System.in);
	    T=sc.nextInt();
	    
	    for(k=0;k<T;k++)
	    {
	        length=sc.nextInt();
	        a=new int[length];
	        
	        for(i=0;i<length;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        
	        for(i=0;i<length;i++)
	        {
	            sum=a[i];
	            
	             if(sum>max_all)
	               {
	                   max_all=sum;
	               }
	               
	            for(j=i+1;j<length;j++)
	            {
	                sum=sum+a[j];
	               if(sum>max_all)
	               {
	                   max_all=sum;
	                   loc_i=i;
	                   loc_j=j;
	               }
	            }
	            

	        }
	            System.out.println(max_all);
	            max_all=Integer.MIN_VALUE;

	    }
	    
	}
}
