import java.util.*;
class DupRemoval
{
	public static String DupliRemovalFunc( String s )
	{
		String str = new String();
		int len = s.length();
		for(int i=0;i<len;i++)
		{
			char c = s.charAt(i);
			if(str.indexOf(c)<0)
				str = str+c;
		
		}
		return str;
	
	}

	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String s= new String();
		String ans= new String();
		s=scan.nextLine();
		System.out.println(s);
		ans=DupliRemovalFunc( s );
		System.out.println(ans);

	}

























}

