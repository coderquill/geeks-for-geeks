import java.util.*;
import java.lang.*;
import java.io.*;

class Reverse {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt();
        for( int i = 0; i < t; i++)
        {
            String name = sc.next();
            int strlen=name.length();
            
            String reverse = "";
            for( int k = name.length() - 1; k >= 0; k-- )
            {
                reverse = reverse + name.charAt(k);
                
            }
            System.out.println(reverse);
        }   

	}
}
