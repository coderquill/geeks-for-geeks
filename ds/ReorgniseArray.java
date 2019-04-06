import java.lang.*;
import java.io.*;
import java.util.*;
class ReorgniseArray
 {
    public static void fix(int[] a){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1)
            hs.add(a[i]);
        }
        for(int i=0;i<a.length;i++){
            if(hs.contains(i))
            a[i]=i;
            else{
                a[i]=-1;
            }
        }
        for(int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
         }
         System.out.println(" ");
    }
    
    	public static void main (String[] args) throws Exception
	 {
	 //code
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
	 for(int i=0;i<t;i++){
	     int n=Integer.parseInt(br.readLine());
	   //  int d=s.nextInt();
	     int a[]=new int[n];
	     String[] s = br.readLine().split(" "); 
	     for(int j=0;j<n;j++){
	         a[j]=Integer.parseInt(s[j]);
	     }
	     fix(a);
	 }
	 }
}
