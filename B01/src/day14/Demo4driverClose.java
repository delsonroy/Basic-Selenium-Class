package day14;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4driverClose {

	//child browser - window popup
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///F:/Selenium/webpages/pages/Sample11.html");
			System.out.println(driver.getTitle());
			driver.findElement(By.id("A5")).click();
			
			Thread.sleep(1000);
			
			Set<String> allWHS = driver.getWindowHandles();//no duplicate no index
			System.out.println(allWHS.size());
			
			for(String wh:allWHS)
			{
				driver.switchTo().window(wh);
				
				Thread.sleep(2000);
				driver.close();
				
			}	    
			
		}

	}
