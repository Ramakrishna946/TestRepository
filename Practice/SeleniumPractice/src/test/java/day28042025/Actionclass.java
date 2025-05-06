package day28042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@data-action-params='{\"toasterType\":\"AIS_INGRESS\"}']")).click();
		
		Actions act= new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//div[@id='nav-link-accountList']//a[1]")); 
		act.moveToElement(element).build().perform();
		element=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		act.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("samsung pro").build().perform();
		act.moveToElement(element).click().doubleClick().build().perform();
		act.moveToElement(element).click().keyDown(Keys.BACK_SPACE).build().perform();
		act.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("i phone !^ pro max").doubleClick().build().perform();
		act.moveToElement(element).click().contextClick().build().perform();
		act.moveByOffset(100, 10).build().perform();
		driver.quit();

	}

}
