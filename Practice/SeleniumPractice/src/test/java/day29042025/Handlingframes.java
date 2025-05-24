package day29042025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://automationtesting.co.uk/iframes.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total iframes on the page: " + iframes.size());
		for(int i=0;i<iframes.size();i++){
		    System.out.println(iframes.get(i));
		} 
		driver.switchTo().frame(0);
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("a.toggle")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//ul/li/a[.='Actions']")).click();
		//Thread.sleep(5000);
		driver.quit();
	}

}
