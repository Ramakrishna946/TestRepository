package day07042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumpract {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("rahulshetty@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Iamking@00");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	



}
