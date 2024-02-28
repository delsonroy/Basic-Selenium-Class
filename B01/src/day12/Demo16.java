package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo16 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		
		WebElement ele=driver.findElement(By.name("q"));
		
		Actions s= new Actions(driver);
		s.keyDown(Keys.SHIFT).sendKeys("hello selenium").perform();
				
	}

}
