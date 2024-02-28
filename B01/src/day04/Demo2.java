package day04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement username = driver.switchTo().activeElement();
		username.sendKeys("trainee");
		//selecting the option
		username.sendKeys(Keys.CONTROL+"a");
		
		username.sendKeys(Keys.CONTROL+"c");
		
		username.sendKeys(Keys.TAB);
		
		WebElement pass = driver.switchTo().activeElement();
		
		pass.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(2000);
		
		
		driver.close();	
		driver.quit();
		
	}

}
