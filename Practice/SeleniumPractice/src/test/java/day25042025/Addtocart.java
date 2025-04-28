package day25042025;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		
		String[] vegetables= {"Brocolli","Beetroot","Carrot","Brinjal","Mushroom","Onion","Orange","Potato","Pears"};
		int j=0;
		List<WebElement>products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size(); i++) {
			
			String[] item=products.get(i).getText().split("-");
			String actitem=item[0].trim();
			List vegetableslist=Arrays.asList(vegetables);
			
			if(vegetableslist.contains(actitem))
			{	 
				
				System.out.println("the required actual item : " +actitem);
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				getScreenshot(driver);
				if(j==vegetables.length) {
					break;
				}
			}
			
		}
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		getScreenshot(driver);
		driver.quit();
	}
	public static void getScreenshot(WebDriver driver) throws IOException {
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		FileUtils.copyFile(src, new File("C:\\Users\\chkri\\eclipse-workspace\\SeleniumPractice\\Screenshots\\Screenshot_" + timestamp + ".png"));
		
	}
	

}
