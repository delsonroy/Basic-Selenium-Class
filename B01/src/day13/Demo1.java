package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) {
		// How to handle alert frames
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
        driver.switchTo().frame(0);
		WebElement ele1 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		
		WebElement ele2=driver.findElement(By.xpath("//p[text()='Drop here']"));
			
		Actions act= new Actions(driver);
		
		act.dragAndDrop(ele1, ele2).perform();
		
		driver.switchTo().defaultContent();

	}

}
