package day01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	
	public static void automationscript(ChromeDriver driver)
	{
		
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();	
	//100 lines
	
	}
	public static void automationscript(FirefoxDriver driver)
	{		
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
	
	//100 lines
	
	}
	public static void automationscript(EdgeDriver driver)
	{		
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
	
	//100 lines
	
	}
		
	public static void main(String[] args) {
	
		ChromeDriver driver= new ChromeDriver();
		Demo1.automationscript(driver);
		
		FirefoxDriver driver1= new FirefoxDriver();
		Demo1.automationscript(driver1);
		
		EdgeDriver driver2 = new EdgeDriver();
		Demo1.automationscript(driver2);		

	}

}
