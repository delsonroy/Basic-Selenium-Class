package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demo2
{
	
public static void main(String[] args) throws InterruptedException  {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
    String title = driver.getTitle();
    System.out.println(title);
    String url = driver.getCurrentUrl();
    System.out.println(url);
    Thread.sleep(3000);
    String src = driver.getPageSource();
    System.out.println(src);
    
    driver.close();
    
	
}


}