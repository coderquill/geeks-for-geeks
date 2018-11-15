import java.util.*;
import java.lang.*;
import java.io.*;

class DivisionWOOperators{
   
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	   if(a>b)
	    {
	        int count = 0;
	        int res = b;
	        while(res<a)
	        {
	            res=res+b;
	            count++;
	            
	        }
	         System.out.println(count);
	    }
	    else
	        System.out.println("0");
	    
	}
}
