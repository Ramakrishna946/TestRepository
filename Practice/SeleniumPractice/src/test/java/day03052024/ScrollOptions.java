package day03052024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollOptions {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.manage().deleteAllCookies();
	        JavascriptExecutor js=(JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500)");
	        Thread.sleep(3000);
	        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	       List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	       int sum=0;
	       
	       for(int i=0; i<values.size(); i++) {
	    	  int value= Integer.parseInt(values.get(i).getText());
	    	  sum=sum+ value; 
	    	  System.out.println(sum);
	       }
	        System.out.println("The Total value is : " +sum);
	        
	       String Total= driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
	       int totalval=Integer.parseInt(Total);
	       SoftAssert asser = new SoftAssert();
	       asser.assertEquals(totalval, sum);
	       System.out.println(totalval);
	        driver.quit();
	        asser.assertAll();
	}

}
