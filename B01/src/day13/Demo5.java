package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium/webpages/pages/Sample10.html");
		
		driver.findElement(By.id("t1")).sendKeys("hi");
		
		driver.switchTo().frame("f1");
		
		driver.findElement(By.id("t2")).sendKeys("hi");
		
		driver.switchTo().defaultContent();
		
		

	}

}
