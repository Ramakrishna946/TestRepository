package day24042025;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		
		getScreenshot(driver);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		getScreenshot(driver);
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("td[class=' ui-datepicker-week-end.ui-datepicker-current-day']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		getScreenshot(driver);
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=1; i<7;i++) {
			//Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		WebElement selDropDwn=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(selDropDwn);
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
			System.out.println("The calender field is Enabled");
		}
		else {
			System.out.println("The calender fielsd is Not Enabled");
		}
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
			System.out.println("The calender field is Enabled");
		}
		else {
			System.out.println("The calender fielsd is Not Enabled");
		}
		getScreenshot(driver);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$btn_FindFlights']")).click();
		driver.quit();    
	}

	public static void getScreenshot(WebDriver driver) throws IOException {
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		FileUtils.copyFile(src, new File("C:\\Users\\chkri\\eclipse-workspace\\SeleniumPractice\\Screenshots\\Screenshot_" + timestamp + ".png"));
		
	}
}
