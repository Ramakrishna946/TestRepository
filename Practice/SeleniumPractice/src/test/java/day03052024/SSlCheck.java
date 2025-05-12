package day03052024;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSlCheck {

    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("--incognito");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();

        System.out.println(driver.getTitle());

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String time = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        FileUtils.copyFile(src, new File("C:\\Users\\chkri\\git\\repository2\\Practice\\SeleniumPractice\\Screenshots\\Screenshots_" + time + ".png"));

        // Example usage of relative locators (update as needed for real elements on the page)
        // Find a reference element first
        // For demo purpose only (this site may not have an <input> or clear layout)
        // Replace below with real element locators if needed
//        WebElement referenceElement = driver.findElement(By.tagName("h1"));
//        WebElement inputAbove = driver.findElement(RelativeLocator.with(By.tagName("input")).above(referenceElement));
//        driver.findElement(RelativeLocator.with(By.tagName("")).)
        driver.quit();
    }
}
