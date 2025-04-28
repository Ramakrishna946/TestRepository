package day17042025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.out.println("🔧 BeforeClass - Opening browser for LoginTest");
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        driver.findElement(RelativeLocator.with(By.partialLinkText("More"))).click();
    }

    @Test
    public void testLoginPageTitle() {
        System.out.println("🧪 Testing login page title");
    }
    @Test
    public void testHomePageTitle() {
        System.out.println("🧪 Testing home page title");
    }
    
    @AfterClass
    public void tearDown() {
        System.out.println("🧹 AfterClass - Closing browser for LoginTest");
        driver.quit();
    }
}
