package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium/webpages/MyWebPages/Sample9.html");
		
		boolean ele1 = driver.findElement(By.id("A6")).isSelected();
		System.out.println(ele1);//false
		boolean ele2 = driver.findElement(By.id("A5")).isSelected();
		System.out.println(ele2);
		
		boolean ele3 = driver.findElement(By.id("A1")).isEnabled();
		System.out.println(ele3);
		boolean ele4 = driver.findElement(By.id("A4")).isEnabled();
		System.out.println(ele4);
		
		boolean ele5=driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(ele5);

	}

}
