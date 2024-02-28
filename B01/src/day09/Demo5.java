package day09;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
       // driver.manage().window().fullscreen();
        
        File src = driver.findElement(By.name("username")).getScreenshotAs(OutputType.FILE);
        
        File dstFile= new File("./image/username.png");
		
        FileUtils.copyFile(src, dstFile);
        driver.quit();
	}

}
