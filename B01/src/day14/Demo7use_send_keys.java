package day14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7use_send_keys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B88%20Selenium/pages/Sample11.html");
		
		driver.findElement(By.id("A5")).click();
		
		Thread.sleep(3000);
		
		
		
		Set<String> allWHS = driver.getWindowHandles();

		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			if(title.equals("Swara") || title.equals("Akshara") )
			{
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(title);		
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
