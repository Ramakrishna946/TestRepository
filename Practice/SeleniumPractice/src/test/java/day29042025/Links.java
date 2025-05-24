package day29042025;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();
        WebElement ele=driver.findElement(By.xpath("//button[normalize-space()='Home']"));
        String colour=ele.getCssValue("color");
        System.out.println("The Colour is :" +colour);

        // 1. Total links on the page
        System.out.println("Total links on the page: " + driver.findElements(By.tagName("a")).size());

        // 2. Links in footer section
        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println("Links in footer: " + footer.findElements(By.tagName("a")).size());
        

        // 3. Links in 1st column of footer
        WebElement coldriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        List<WebElement> links = coldriver.findElements(By.tagName("a"));
        System.out.println("Links in first column: " + links.size());

        // 4. Open each link in a new tab
        for (int i = 1; i < links.size(); i++) {
            String openInNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            links.get(i).sendKeys(openInNewTab);
        }

        // 5. Switch to each tab and print title
        Set<String> allWindows = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(allWindows);

        for (String handle : windowList) {
            driver.switchTo().window(handle);
            System.out.println("Page title: " + driver.getTitle());
        }

        driver.quit();
    }
}
