package day14;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6Set_to_List {
//child browser - window popup
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Selenium/webpages/pages/Sample11.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("A5")).click();
		
		Thread.sleep(7000);
		
		Set<String> whs = driver.getWindowHandles();	
		ArrayList<String> lst= new ArrayList<String>(whs);
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
		
		System.out.println(driver.switchTo().window(lst.get(1)).getTitle());
		
//		Set<String> allWHS = driver.getWindowHandles();//no duplicate no index
//		ArrayList<String> a=new ArrayList<String>(allWHS);
//		System.out.println(a.get(1));
//		System.out.println(a.get(2));
//		System.out.println(a.get(0));
//	
//		String t=driver.switchTo().window(a.get(2)).getTitle();
//		System.out.println(t);
//		driver.quit();
		
	}

}
