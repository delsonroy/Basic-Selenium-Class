package day13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {
//right click - context click --> we get context menu
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act= new Actions(driver);
		act.contextClick(ele).perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
		
		

		
	}

}