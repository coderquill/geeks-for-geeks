import java.util.*;
import java.io.*;
class Pangram
{
	public static boolean check(String s)
	{
		boolean[] mark = new boolean[26];
		int index=0,i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				index=s.charAt(i)-'A';
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
				index=s.charAt(i)-'a';
			mark[index]=true;
		}
		for(i=0;i<26;i++)
		{
			if(mark[i]==false)
				return (false);
		}
		return (true);
	
	}
	public static void main(String[] args)
	{	
		boolean result;
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(s);
		result=check(s);
		if(result == false)
			System.out.println("not a pangram");
		else
			System.out.println("a pangram");
	}
}
