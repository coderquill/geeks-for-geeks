import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int i=0; i<cases; i++){
		    String string = scan.nextLine();
		    String s = new String();
		    char c;
		    int len = string.length();
		    for(int j=0; j<len; j++){
		        c = string.charAt(j);
		        if(s.indexOf(c)<0)
		            s=s+c;
		    }
		    System.out.println(s);
	    }
	}
}
