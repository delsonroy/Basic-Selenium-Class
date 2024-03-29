package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		     //id or Name
		
		WebElement frameElement = driver.findElement(By.name("callout"));  
		
		driver.switchTo().frame(frameElement); 
		
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.quit();		
	}

}
