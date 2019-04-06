//Reverse words in a given String in
import java.util.*; 
public class WordReverse { 
  
    static String reverseWords(String str) 
    { 
  
        Pattern pattern = Pattern.compile("\\s"); 
  
        String[] temp = pattern.split(str); 
        String result = ""; 
  
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 

    public static void main(String[] args) 
    { 
        String s1 = "Hi I am Rupali"; 
        System.out.println(reverseWords(s1)); 
  
        String s2 = "I am happy."; 
        System.out.println(reverseWords(s2)); 
    } 
} 
