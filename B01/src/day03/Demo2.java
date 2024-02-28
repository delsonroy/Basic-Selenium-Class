package day03;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	private static final String URL = null;

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		//Thread.sleep(20000);
		
		//difference bw driver.get() and navigate.to()
		//diff bw driver.navigate() and driver.get();
		
		//overlaoded
		driver.navigate().to("https://www.fb.com");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		

	}

}
