package day24042025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		List<WebElement> check = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(check.size());
		SoftAssert soft=new SoftAssert();
		soft.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		soft.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.id("autosuggest")).sendKeys("br");
		List<WebElement> options1 = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options1) {
			if (option.getText().equalsIgnoreCase("Gibraltar")) {
				option.click();
				break;
			}

		}
		driver.quit();
		soft.assertAll();
		
	}

}
