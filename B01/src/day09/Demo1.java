package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/Selenium%20Class/Practice%20WebPages/Sample7.html");
		
		WebElement API=driver.findElement(By.xpath("//td[.='API']"));
		
		//driver.findElement(RelativeLocator.with(By.xpath("(//input[1])[3]")).toRightOf(API)).click();
		
		driver.findElement(RelativeLocator.with(By.xpath("(//input[1])[3]")).toRightOf(By.xpath("//td[.='API']"))).click();
		String ele=driver.findElement(RelativeLocator.with(By.xpath("//td[.='SQL']")).above(API)).getText();
		System.out.println(ele);		
		
		
		

	}

}
