package day11;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		File s1 = driver.findElement(By.name("username")).getScreenshotAs(OutputType.FILE);
		
		String location =s1.getAbsolutePath();
		System.out.println(location);
		
		Thread.sleep(15000);
		driver.quit();
		 
		
		

	}

}
