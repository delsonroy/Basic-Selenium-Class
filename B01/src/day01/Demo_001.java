package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver Driver = new ChromeDriver();
Driver.get("https://www.google.com");
Thread.sleep(3000);
Driver.close();
}

}
