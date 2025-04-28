package day27042025;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		// Click Start button
		driver.findElement(By.xpath("//div[@id='start']/button")).click();

		// FluentWait configuration
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60)) // Max 60 seconds
				.pollingEvery(Duration.ofSeconds(5)) // Check every 10 seconds
				.ignoring(NoSuchElementException.class); // Ignore if not found

		// Correct way: use a lambda function
		WebElement helloText = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath("//div[@id='finish']/h4"));
				if (element.isDisplayed()) {
					return element;
				} else {
					return null;
				}
			}
		});

		// Print the text
		System.out.println("The Text is: " + helloText.getText());

		driver.quit();
	}
}
