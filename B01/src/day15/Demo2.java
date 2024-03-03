package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		
		String s= "delson";
		
			int len=	s.length();
		
		String rev="";
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
				
		System.out.println(rev);
	}

}