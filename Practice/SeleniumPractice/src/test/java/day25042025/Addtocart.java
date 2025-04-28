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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
		
		String[] vegetables= {"Brocolli","Beetroot","Carrot","Brinjal","Mushroom","Onion","Orange","Potato","Pears","Raspberry","Cashews"};
		String promo="rahulsettyacademy";
		addItemstotheCart(driver,vegetables);
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys(promo);
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		getScreenshot(driver);
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		
		WebElement country = driver.findElement(By.xpath("//select"));
		Select dropdown = new Select(country);
		dropdown.selectByValue("India");
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		driver.findElement(By.tagName("button")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Thank you, your order has been placed successfully')]")).getText());
		getScreenshot(driver);
		driver.quit();
	}
	
	
	
	public static void addItemstotheCart(WebDriver driver,String[] vegetables) throws IOException {
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
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				getScreenshot(driver);
				if(j==vegetables.length) {
					break;
				}
			}
			
		}
		
	}
	public static void getScreenshot(WebDriver driver) throws IOException {
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		FileUtils.copyFile(src, new File("C:\\Users\\chkri\\git\\repository2\\Practice\\SeleniumPractice\\Screenshots\\Screenshot_" + timestamp + ".png"));
		
	}
	

}
