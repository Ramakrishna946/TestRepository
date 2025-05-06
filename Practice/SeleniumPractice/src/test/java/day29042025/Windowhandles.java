package day29042025;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='Flight Booking']")).click();
		Set<String> windows=driver.getWindowHandles();
		System.out.println("Number of open windows: " + windows.size());
		
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Hotels']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//a[normalize-space()='Top Deals']")).click();
		System.out.println(driver.getTitle());
		Set<String> windows1=driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windows1);
		System.out.println("Number of open windows: " + windows1.size());
		driver.switchTo().window(windowList.get(2));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@aria-label='Last']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.tagName("tr")).getText());
		driver.close();
		driver.quit();
		
	}
	
	
}
