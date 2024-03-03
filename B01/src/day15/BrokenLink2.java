package day15;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink2 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement allLinks : links) {
			
			String url=allLinks.getAttribute("href");
			
			if(url!=null && !url.isEmpty())
			{
				verify(url);
			}
		}
		
		
		
	}

	public static void verify(String url) throws Exception  {

		URL linkurl= new URL(url);
		
		HttpURLConnection connection = (HttpURLConnection)linkurl.openConnection();
		
		
		connection.setRequestMethod("HEAD");
		
		connection.connect();
		
		int responsecode=connection.getResponseCode();	
		
		System.out.println(url+" - "+responsecode);
		if(responsecode==200)
		{
			System.out.println(url +"url working");
		}
		else
		{
			System.out.println(url +"url not working");
		}
		
		connection.disconnect();
		
	}

}
