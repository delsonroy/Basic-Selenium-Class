package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//div[text()='Hover over me']"));
		Actions s = new Actions(driver);
		s.moveToElement(ele1).perform();
		driver.quit();

	}
}