package day15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinkChecker {

    public static void main(String[] args) {
        // Set ChromeDriver path
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://www.google.com");

        // Find all anchor elements
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterate over each link
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                // Check the URL
                verifyLink(url);
            }
        }

        // Close the browser
        driver.quit();
    }

    public static void verifyLink(String url) {
        try {
            // Create a URL object
            URL linkUrl = new URL(url);

            // Open an HTTP connection
            HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection();

            // Set the request method
            connection.setRequestMethod("HEAD");

            // Connect to the URL
            connection.connect();

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Print the URL and response code
            System.out.println(url + " - " + responseCode);

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
