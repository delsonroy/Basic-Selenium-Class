package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Class/RegistrationPage.html");
		
		//driver.findElement(By.linkText("messages123")).click();
		Thread.sleep(2000);
		
	
		driver.findElement(By.partialLinkText("messages")).click();
		
		driver.close();
		

	}

}
