package day27042025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollDownExample {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        // Navigate to a website (example.com in this case)
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        // Scroll down to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // You can wait to observe the scroll action (optional)
        try {
            Thread.sleep(2000);  // 2 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser after the action is done
        driver.quit();
    }
}
