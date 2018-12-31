import java.util.*;
import java.io.*;
class SwapFirstLast
{	
	public static String count(String s)
	{
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{ 

            		int k = i; 
            		while (i < ch.length && ch[i] != ' ')  
               			 i++; 
              
            
            		char temp = ch[k]; 
            		ch[k] = ch[i - 1]; 
           		ch[i - 1] = temp; 
  
            
        	} 
        	return new String(ch); 
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(count(s)); 
	
	}
}

