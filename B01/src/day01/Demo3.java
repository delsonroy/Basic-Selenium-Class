package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo3 {

	
	public static void automationscript(WebDriver driver)
	{
		
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();	
	//100 lines
	
	}
	
	
	//100 lines
	
	
	public static void main(String[] args) {
	
		ChromeDriver driver= new ChromeDriver();
		Demo3.automationscript(driver);
		
		FirefoxDriver driver1= new FirefoxDriver();
		Demo3.automationscript(driver1);
		
		EdgeDriver driver2 = new EdgeDriver();
		Demo3.automationscript(driver2);		

	}

}
