package day11;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();//upcasting
		
		//Whats the purpose of this line// to run the codes on any browser
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		
		Date currentDate = new Date();
		System.out.println(currentDate);
        String timestamp = currentDate.toString().replace(" ", "_").replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./images/LoginPage2"+timestamp+".png");
		 
		FileUtils.copyFile(src, dst);
		
		
		driver.quit();		

	}

}
