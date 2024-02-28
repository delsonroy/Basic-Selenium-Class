package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(), 'practice iframe')]"));
		Actions act= new Actions(driver);
		act.scrollToElement(ele).perform();
		
		
		
		//
		
	}

}
