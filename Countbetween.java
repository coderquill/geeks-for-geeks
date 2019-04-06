import java.util.*;
import java.lang.*;
import java.io.*;


class Countbetween
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=0;
		int queries=in.nextInt();
		for(int i=0;i<queries;i++)
		{
		count=in.nextInt();
		int total=0;
		int n=count / 100;
		int m=count % 100;
		if(count<600 && count > 10)
		{
			total=total+(n*25)+5;
			if(m<60 && m>10)
			{
    			int x1=m/5;
    			if(x1%2==1)
    			{
    				total=total+(x1/2)*5;
    			}
    			else
    				total=total+((x1/2-1)*5+(m%10));
			}
			else if(m>60)
				total=total+25;
		}
		else if(count>600)
			total=(25*6)+5;
		
		else if(count<10)
            if(count/5==1)
                total=5;
            else
                total=count%5;
        

		System.out.println(total);
		}
	}

}
