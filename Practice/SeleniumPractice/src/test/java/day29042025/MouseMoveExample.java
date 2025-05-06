package day29042025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);
        act.moveByOffset(500, 50).click().build().perform();  // move mouse and click
        //driver.quit();
    }
}
