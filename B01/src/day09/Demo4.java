package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/Selenium%20Class/Practice%20WebPages/Sample8.html");
		WebElement java=driver.findElement(By.xpath("//td[.='Java']"));
		String ele=driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(java)).getText();
		System.out.println(ele);
		String ele2=driver.findElement(RelativeLocator.with(By.tagName("td")).toLeftOf(java)).getText();
		System.out.println(ele2);
		String ele3=driver.findElement(RelativeLocator.with(By.tagName("td")).above(java)).getText();
		System.out.println(ele3);
		String ele4=driver.findElement(RelativeLocator.with(By.tagName("td")).below(java)).getText();
		System.out.println(ele4);
		
		

	}

}
