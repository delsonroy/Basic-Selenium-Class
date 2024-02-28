package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		boolean dateFound= false;
		for (int i = 0; i < 8; i++) {
			

			try {
				driver.findElement(By.xpath("//div[text()='August 2024']/../..//p[text()='1']")).click();
				System.out.println("seleccted the date");
				dateFound= true;
				break;
				

			} catch (Exception e) {

				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				System.out.println("date not found so navigating to next");
				Thread.sleep(2000);
			}
		}
		 if (!dateFound) {
	            System.out.println("Desired date not found in the next 12 months.");
	        }


		//

		//
		// driver.quit();

	}
}