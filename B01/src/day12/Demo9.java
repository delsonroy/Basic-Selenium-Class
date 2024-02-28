package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='TESTIMONIALS']"));
	    
		Thread.sleep(2000);
		String s=ele.getText();
		System.out.println(s);
		driver.quit();
		
	}

}
