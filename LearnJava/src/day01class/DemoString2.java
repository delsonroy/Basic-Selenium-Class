package day01class;

import java.util.Arrays;

public class DemoString2 {

	public static void main(String[] args) {
		
		
		//How to check strings tringsare anagram
		
		
		String str1=   "Listen";
		String str2=    "Silent";
		
        char[] Strarr1 = str1.toCharArray();
        char[] Strarr2 = str2.toCharArray();
        
        Arrays.sort(Strarr1);
        Arrays.sort(Strarr2);
        
        boolean str3 = Arrays.equals(Strarr1, Strarr2);
        
     
        System.out.println(str3);
        
        if(str3)
        {
        	System.out.println("its not anagram");
        }
        else
        {
            System.out.println("its anagram");
        }
                        
		

	}

}
