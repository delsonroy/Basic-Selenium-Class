package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Class/RegistrationPage.html");
		
		driver.findElement(By.cssSelector("label[for='email']")).sendKeys("del");
	}

}
