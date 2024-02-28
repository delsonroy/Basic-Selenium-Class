package day04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement username = driver.switchTo().activeElement();
		username.sendKeys("admin");
		username.sendKeys(Keys.TAB);
		
	   WebElement pass = driver.switchTo().activeElement();
	   pass.sendKeys("admin123");
	   pass.sendKeys(Keys.TAB);
	   
	    WebElement login = driver.switchTo().activeElement();
	    login.sendKeys(Keys.ENTER);
		
		
		
	}

}
