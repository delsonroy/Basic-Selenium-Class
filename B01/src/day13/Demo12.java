package day13;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium/webpages/pages/Sample11.html");
		
		driver.findElement(By.xpath("//a[text()='Child window']")).click();
		
		Set<String> wh=driver.getWindowHandles();
		
		for (String whs : wh) {
			
			        
			  System.out.println(whs);   
			System.out.println(driver.getTitle());
		}
		
		
		//System.out.println(wh);
		
		driver.quit();
		
	}

}
