package day07042025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tpointtech.com/java-tutorial");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement element1= driver.findElement(By.xpath("//li[@class='leftmenu']//a[normalize-space()='Java Variables']"));

		
		action.moveToElement(element1).click().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement element2= driver.findElement(By.xpath("//a[normalize-space()='OOPs Concepts in Java']"));
		
		action.moveToElement(element2).click().perform();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		WebElement element3=driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='DBMS']"));
		action.moveToElement(element3).click().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
