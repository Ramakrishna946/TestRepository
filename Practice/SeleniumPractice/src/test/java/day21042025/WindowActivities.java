package day21042025;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowActivities {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://careers.cognizant.com/india-en/");
        System.out.println(driver.getTitle());
        String parentWindow= driver.getWindowHandle();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        
        // Step 3: Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Step 4: Switch to the new window
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Step 5: Perform actions in the new window
        System.out.println("Title of new window: " + driver.getTitle());
        
        driver.quit();
        
	}

}
