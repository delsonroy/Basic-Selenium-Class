package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement ele1 = driver.findElement(By.name("q"));
		ele1.sendKeys("hello");
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Stay signed out']"));
		System.out.println(ele.getText());
		ele.click();
		
		driver.switchTo().defaultContent();
		
		ele1.clear();
		ele1.sendKeys("delson");
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
