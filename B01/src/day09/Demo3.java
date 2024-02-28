package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("dd");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);

		WebElement errmsg = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));

		String t = errmsg.getText();
		System.out.println(t);

		String at = errmsg.getAttribute("class");
		System.out.println(at);

		String tag = errmsg.getTagName();
		System.out.println(tag);

		String col = errmsg.getCssValue("color");
		System.out.println(col);

		String col2 = Color.fromString(col).asHex();
		System.out.println(col2);

		String ff = errmsg.getCssValue("font-family");
		System.out.println(ff);

		String fs = errmsg.getCssValue("font-size");
		System.out.println(fs);

	}

}
