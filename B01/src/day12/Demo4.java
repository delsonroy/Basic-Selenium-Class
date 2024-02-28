
package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in");
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("ur username");
		driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("ur password");
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
        Thread.sleep(2000);
		String msg = driver.findElement(By.xpath("//div[@role='alertdialog']")).getText();
	    System.out.println(msg);
	}

}
