package day07042025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProgramIframes {
	
	

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.get("https://www.tpointtech.com/java-tutorial");
		
		List<WebElement> iframeElements1 = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are " + iframeElements1.size());
		System.out.println(" The List Of IFrames are as Follows : " + iframeElements1);
		
		driver.findElement(By.xpath("//a[normalize-space()='Program Internal']")).click();
		
		//driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='CSS']")).click();
		driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']//*[name()='svg']")).click();
		
		List<WebElement> iframeElements2 = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are " + iframeElements2.size());
		System.out.println(" The List Of IFrames are as Follows : " + iframeElements2);
		
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[@class='p_ styleable-title a']")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//li[@class='leftmenu']//a[normalize-space()='Java Variables']")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
