package day27042025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Click on Start button
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        // Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until "Hello World!" text is visible
        WebElement helloText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));

        System.out.println("The text is: " + helloText.getText());

        driver.quit();
    }
}

