package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Class/Sample3.html");

		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("abc");

	}

}
