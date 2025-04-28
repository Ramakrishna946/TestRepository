package day21042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		String Name="Ramakrishna Chintha";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		driver.findElement(By.name("inputPassword")).sendKeys("password1223");
		driver.findElement(By.className("signInBtn")).click();
		String errmsg= driver.findElement(By.cssSelector("p.error")).getText();
		
		Assert.assertEquals("* Incorrect username or password", errmsg);
		//boolean che =driver.findElement(By.id("chkboxOne")).isSelected();
		driver.findElement(By.id("chkboxOne")).click();
		boolean che1 =driver.findElement(By.id("chkboxOne")).isSelected();
		
		if(che1==false) {
			driver.findElement(By.id("chkboxOne")).click();
			System.out.println(" Remember my username The CheckBox   is selected Now");
			
		}else {
			//driver.findElement(By.id("chkboxOne")).click();
			System.out.println("Remember my username Already is Selected ");
		}
		System.out.println(che1);
		System.out.println(errmsg);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ramakrishna");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rama@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9738776373");
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String msginfo=driver.findElement(By.xpath("//form/p")).getText();
		System.out.println(msginfo);
		driver.findElement(By.className("go-to-login-btn")).click();
		
		String password=getPassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		
		
		boolean che2 =driver.findElement(By.id("chkboxOne")).isSelected();
		
		if(che2==false) {
			driver.findElement(By.id("chkboxOne")).click();
			System.out.println(" Remember my username The CheckBox   is selected Now");
			
		}else {
			//driver.findElement(By.id("chkboxOne")).click();
			System.out.println("Remember my username Already is Selected ");
		}
		System.out.println(che2);
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
		//String Aftlgntxt1=driver.findElement(By.xpath("//div/h2")).getText();
		Thread.sleep(2000);
		String Aftlgntxt2=driver.findElement(By.xpath("//h1[1]")).getText();
		
		
		String Aftlgntxt=driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(Aftlgntxt, "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("h2")).getText() +Aftlgntxt);
		System.out.println(Aftlgntxt2 );
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
