package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().window().maximize();
		
		
		 WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		 WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
	
		 
		 Actions s= new Actions(driver);
		 Thread.sleep(2000);
		 s.dragAndDrop(block2, block3).perform();
		
		 Thread.sleep(3000);
		
		// driver.quit();
		
		
	}

}
