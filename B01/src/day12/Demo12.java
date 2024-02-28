package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo12 {
//right click - context click --> we get context menu
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act= new Actions(driver);
		act.contextClick(ele).perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		
		

		
	}

}
