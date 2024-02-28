package day14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//child browser - window popup
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B88%20Selenium/pages/Sample11.html");
		driver.findElement(By.id("A5")).click();
		
		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();//no duplicate no index
		System.out.println(allWHS.size());
		
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
		
		//driver.quit();
	
		
	}

}
