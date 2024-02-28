package day13;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium/webpages/pages/Sample11.html");

		driver.findElement(By.cssSelector("a[id='A3']")).click();

		driver.findElement(By.cssSelector("a[id='PageLink_5']")).click();

		driver.findElement(By.cssSelector("a#DirectLink_20")).click();

		String pathname = "C://Users//USER//Downloads//resources.pdf/";
		
		Thread.sleep(20000);

		File file = new File(pathname); // Creating an instance// copy//version

		boolean ex = file.exists();

		if (ex) {

			System.out.println("file exist");

		} else {
			System.out.println("file not exist");

		}

	}

}
