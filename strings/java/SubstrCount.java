//Sub-strings that start and end with one character and have at least one other

import java.util.*;

public class SubstrCount { 
  
    static int nextIndex(String str, int start, char c) 
    { 
  
       
        for (int i = start; i < str.length(); i++) { 
  
           
            if (str.charAt(i) == c) 
                return i; 
        } 
  
        return -1; 
    } 
  
    // Function to return the count of required sub-strings 
    static int countSubStrings(String str) 
    { 
        int i, n = str.length(); 
  
        int countX[] = new int[n]; 
  
        int count = 0; 
        for (i = n - 1; i >= 0; i--) { 
            if (str.charAt(i) == 'x') 
                count++; 
            countX[i] = count; 
        } 
  
        int nextIndexX = nextIndex(str, 0, 'x'); 
  
        int nextIndexY = nextIndex(str, 0, 'y'); 
  
        count = 0; 
        while (nextIndexX != -1 && nextIndexY != -1) { 
  
            if (nextIndexX > nextIndexY) { 
  
                nextIndexY = nextIndex(str, nextIndexY + 1, 'y'); 
                continue; 
            } 
  
            else { 
                count += countX[nextIndexY]; 
  
                nextIndexX = nextIndex(str, nextIndexX + 1, 'x'); 
            } 
        } 
  
        
        return count; 
    } 
  
    
    public static void main(String[] args) 
    { 
  
        String s = "xyyxx"; 
  
        System.out.println(countSubStrings(s)); 
    } 
}
