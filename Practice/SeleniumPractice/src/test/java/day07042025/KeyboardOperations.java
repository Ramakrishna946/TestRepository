package day07042025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='input_error form_input'][@data-test='username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@class='input_error form_input'][@data-test='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Sauce Labs Backpack"))).keyDown(Keys.CONTROL).keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bike Light']"))).contextClick().perform();
		
		
		driver.close();

	}

}
