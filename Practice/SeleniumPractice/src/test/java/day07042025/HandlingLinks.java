package day07042025;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tpointtech.com/java-tutorial");
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("The total Links in the Page is : " + allLinks.size());
		
		for(WebElement link:allLinks){
			 //System.out.println(link.getText() + " - " + link.getAttribute("href"));
			 }
		for (WebElement link1 : allLinks) {
			String url = link1.getAttribute("href");
			verifyLink(url);
			}
		driver.close();
	}
		
		public static void verifyLink(String url) {
			try {
			URL link1 = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link1.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();


			if (httpURLConnection.getResponseCode() == 200) {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
			} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");

		
	}
			
}
		}
