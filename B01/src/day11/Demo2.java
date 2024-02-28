package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.name("username"));

		int x1 = ele.getLocation().getX();
		System.out.println(x1);

		WebElement ele2 = driver.findElement(By.name("password"));
		int x2 = ele2.getLocation().getX();
		System.out.println(x2);

		if (x1 == x2) {
			
			System.out.println("The allignment is correct");
		} 
		else {
			System.out.println("The allignment is not correct");
		}

	}

}
