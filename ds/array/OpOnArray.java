import java.util.*;
import java.lang.*;
import java.io.*;

class OpOnArray {
	public static int searchEle(int a[],int x,int n)
       {
		
		for( int j = 0; j < n; j++)
		    {
			if (x == a[j])
				return 1;
		    }
		return 0;
	}
	public static int insertEle(int a[],int y,int yi)
        {
              		
		a[y] = yi;
		return 1;
		   
	}
	public static int deleteEle(int a[],int z, int n)
        {
		
		for( int j = 0; j < n; j++)
		    {
			if (z == a[j])
			{
				while((j+1)<n)
				{
					a[j]=a[j+1];
					j++;
				}
				return 1;
			}
			
		     }
		return 0;
	}

	public static void main (String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for( int i = 0; i < t; i++)
		{
		    int n = sc.nextInt();

		    int [] array = new int [n]; 

		    for( int j = 0; j < n; j++)
		    {
			array[j]= sc.nextInt();
		    }
		    
		    int s = sc.nextInt();
			int res1 = searchEle(array,s,n);
		    System.out.println(res1);
		    
		    int y = sc.nextInt();
		     int yi = sc.nextInt();
			int res2 = insertEle(array, y, yi);
			System.out.println(res2);
			/*for( int j = 0; j < n; j++)
		    {
			System.out.print(array[j]);
		    }*/

			int z = sc.nextInt();
			int res3 = deleteEle( array, z ,n);
		    System.out.println(res3);

			
		}   

	}
}
