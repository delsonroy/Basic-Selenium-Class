package day03;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.manage().window().maximize();
		
		
		//Dimension d = new Dimension(500, 600);
		//driver.manage().window().setSize(d);
		//Thread.sleep(2000);
		
		Dimension d1=driver.manage().window().getSize();
		System.out.println(d1);
		
		//Point p = new Point(600, 400);
		//driver.manage().window().setPosition(p);
		
		Point p1=driver.manage().window().getPosition();
		
		System.out.println(p1);
		

	}

}
