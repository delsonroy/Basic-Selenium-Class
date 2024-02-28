package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.name("username"));
		
		int x = ele.getLocation().getX();
		System.out.println(x);
		
		int y =ele.getLocation().getY();
		System.out.println(y);
		//print y axis
		
		
	    int h=ele.getSize().getHeight();
	    System.out.println(h);
	    
	    int w=ele.getSize().getWidth();
	    System.out.println(w);
	    //get width
	}

}
