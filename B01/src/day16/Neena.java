package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
	driver.findElement(By.name("EmailHomePage")).sendKeys("neenaannmary11@gmail.com");
	}

}
