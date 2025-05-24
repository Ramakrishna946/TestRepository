package day20052025practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		//String parentid=driver.getWindowHandle();
		Set<String> alllist=driver.getWindowHandles();
		System.out.println(alllist.size());
		Iterator<String> it=alllist.iterator();
		String parent=it.next();
		String ch1=it.next();
		String ch2=it.next();
		String ch3=it.next();
		String ch4=it.next();
		String ch5=it.next();
		driver.switchTo().window(ch5);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().window(ch3);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).near(ele)).getText());
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).above(ele)).getText());
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).below(ele)).getText());
		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}

}
