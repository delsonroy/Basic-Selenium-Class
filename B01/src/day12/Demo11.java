package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		
		driver.switchTo().frame(0);
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Double Click']"));
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		actions.doubleClick(button).perform();
		
		
	}

}
