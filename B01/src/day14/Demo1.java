package day14;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
//child browser - window popup
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("file:///F:/Selenium/webpages/pages/Sample11.html");
		
		String s=driver.getWindowHandle();  //Parent window
		System.out.println(s);
		
		driver.findElement(By.cssSelector("a#a5")).click();
		
		Set<String> allwhs = driver.getWindowHandles();
		
		for(String abc : allwhs)
		{
			
			System.out.println(abc);
			
	
		
		
		
	}

}
}
