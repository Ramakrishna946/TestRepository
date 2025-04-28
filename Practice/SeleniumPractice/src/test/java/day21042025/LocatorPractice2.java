package day21042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		
		
		String Name="Ramakrishna Chintha";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		String Password=getPassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.quit();

	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String msginfo=driver.findElement(By.xpath("//form/p")).getText();
		String[] PasswordArry=msginfo.split("'");
		String password=PasswordArry[1].split("'")[0];
		driver.findElement(By.className("go-to-login-btn")).click();
		return password;
		
		
	}

}
