package day12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 1500)");
			
		}
		
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,-1500)");
			
		}
		//driver.quit();
	}

}
