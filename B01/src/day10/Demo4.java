package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("ad");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
		
		String color=ele.getCssValue("color");
		System.out.println(color);
		
		String c=Color.fromString(color).asHex();
		System.out.println(c);
		
		System.out.println(ele.getCssValue("font-family"));
		System.out.println(ele.getCssValue("font-size"));
		
		
	}

}
