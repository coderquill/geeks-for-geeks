//Print number of words, vowels and frequency of each character

import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class StringCount  
{ 
    String str = "Rupali Bapusaheb Kavale"; 
  
    void words() 
    { 
        int wCount = 0, uCount = 0, vCount = 0; 
  
        for (int i = 0; i < str.length(); i++)  
        { 
            char c = str.charAt(i); 
  
            switch (c)  
            { 
            case ' ': 
            case '.': 
                wCount++;
            } 
  
            switch (c)  
            { 
           
            case 'A': 
            case 'E': 
            case 'I': 
            case 'O': 
            case 'U': 
            case 'a': 
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': 
                vCount++; 
            } 
  
            if (c >= 65 && c <= 90)  
            { 
                uCount++; 
            } 
        } 
  
        System.out.println("Number of words = " + wCount); 
        System.out.println("Number of vowels = " + vCount); 
        System.out.println("Number of upper case characters = "
                                                        + uCount); 
    } 
 
    void frequency() 
    { 
       
        TreeMap<Character, Integer> hmap =  new TreeMap<Character, Integer>(); 
   
        for (int i = 0; i < str.length(); i++) 
        { 
            Integer c = hmap.get(str.charAt(i)); 
   
            if (hmap.get(str.charAt(i)) == null) 
               hmap.put(str.charAt(i), 1); 
   
            else
              hmap.put(str.charAt(i), ++c); 
        } 
  
        for (Map.Entry m:hmap.entrySet()) 
          System.out.println("Character = " + m.getKey() +  
                         " Frequency = " + m.getValue()); 
    } 
  
    public static void main(String args[]) throws IOException 
    { 
        Stringfun obj = new Stringfun(); 
        obj.words(); 
        obj.frequency(); 
    } 
} 
 
