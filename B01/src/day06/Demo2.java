package day06;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Open the webpage
		        
		        driver.get("https://the-internet.herokuapp.com/login");
		        
		        // Find the sentence containing the username and password
		        WebElement sentenceElement = driver.findElement(By.tagName("h4"));

		        // Get the text of the sentence
		        String sentenceText = sentenceElement.getText();

		        // Find the position of username and password strings
		        int usernameIndex = sentenceText.indexOf("tomsmith");
		        int passwordIndex = sentenceText.indexOf("SuperSecretPassword");
		        
		        System.out.println(usernameIndex);
		        System.out.println(passwordIndex);
		        

		        // Extract username and password strings
		        String username = sentenceText.substring(usernameIndex, usernameIndex + "tomsmith".length());
		        String password = sentenceText.substring(passwordIndex, passwordIndex + "SuperSecretPassword".length());
		        
		        System.out.println(username);
		        System.out.println(password);
		        
		        // Find the username and password input fields and type in the credentials
		        WebElement usernameInput = driver.findElement(By.id("username")); // Change id as per your HTML
		        WebElement passwordInput = driver.findElement(By.id("password")); // Change id as per your HTML

		        // Typing in the username and password
		        usernameInput.sendKeys(username);
		        passwordInput.sendKeys(password);

		        // Close the browser
		        driver.quit();
		    }
		

		
}
		
	


