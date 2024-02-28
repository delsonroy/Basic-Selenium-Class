package day03;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement ele = driver.switchTo().activeElement();
		ele.sendKeys("admin");
		ele.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement ele2 = driver.switchTo().activeElement();
		ele2.sendKeys("admin123");
		ele2.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement ele3 = driver.switchTo().activeElement();
		ele3.sendKeys(Keys.ENTER);		
		
	}

}
