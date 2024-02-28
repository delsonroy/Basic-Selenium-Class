package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Click on the departure date field
        driver.findElement(By.xpath("//span[text()='Departure']")).click();

        // Clicking on the date picker arrow until the desired month is displayed
        boolean dateFound = false;
        for (int i = 0; i < 12; i++) { // Assuming a maximum of 12 months to search
            try {
                driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[text()='AUG 2024']")).click();
                // Click on the desired date (1st August 2024)
                driver.findElement(By.xpath("//div[@class='DayPicker-Day' and @aria-label='Wed Aug 01 2024']"))
                        .click();
                System.out.println("Selected the date: 1st August 2024");
                dateFound = true;
                break;
            } catch (Exception e) {
                // If the desired month is not found, click on the next month arrow
                driver.findElement(By.xpath("//span[contains(@aria-label, 'Next Month')]")).click();
                System.out.println("Date not found, navigating to the next month...");
                Thread.sleep(2000); // Add a small delay for stability
            }
        }

        if (!dateFound) {
            System.out.println("Desired date not found in the next 12 months.");
        }

        // Close the browser
        driver.quit();
    }
}
