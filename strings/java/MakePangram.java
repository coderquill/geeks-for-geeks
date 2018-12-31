import java.util.*;
import java.io.*;

class MakePangram
{
	public static boolean check(String s)
	{
		int index=0, i;
		boolean[] mark = new boolean[52];
		for(i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='z')
				index=s.charAt(i)-'A';
			//else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			//	index=charAt(i)-'a';
			mark[index]=true;
		
		}
		for(i=0; i<52; i++)
		{
			if(mark[i]==false)
			{
				char res = (char)(i+65);
				System.out.print(res);
			}
		}
		for(i=0; i<52; i++)
		{
			if(mark[i]==false)
			{
				return false;
			}
		}

		return (true);
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		boolean result = check(s);
		if(result==true)
		System.out.println("is a pangram");
		else
		System.out.println("not a pangram");
	}
		
}
