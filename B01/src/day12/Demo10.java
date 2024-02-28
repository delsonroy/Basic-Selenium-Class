package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo10 {

	

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//img[contains(@class, '-dOa_b XdYXbi')]"));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(2000);
			driver.close();
			

		}

	}