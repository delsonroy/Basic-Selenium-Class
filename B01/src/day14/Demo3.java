package day14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
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
			String title=driver.getTitle();
			System.out.println(title);
//			if(title.equals("") || title.equals("") )
//			{
//				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(title);		
//			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
