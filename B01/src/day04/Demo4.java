package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		// enter the username
		driver.findElement(By.name("username")).sendKeys("admin");
		// enter the password
		driver.findElement(By.name("password")).sendKeys("admin123");
		// click on the login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String expectedstring = "dashboard";

		System.out.println("Expected url" + expectedstring);

		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);

		if (actualURL.contains(expectedstring)) {
			System.out.println("pass: new page has been displayed");
		} else

		{
			System.out.println("Fail: new page has been displayed");
		}
	}

}
