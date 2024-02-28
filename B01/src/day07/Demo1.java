package day07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://trends.builtwith.com/websitelist/Responsive-Tables");
        String ele=driver.findElement(By.xpath("//td[contains(text(), 'piktochart')]/../td[5]")).getText();	
        System.out.println(ele);
        driver.quit();
	}

}
