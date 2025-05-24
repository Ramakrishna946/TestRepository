package day03052024;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSlCheck {

	public static void main(String[] args) throws IOException {
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();
        System.out.println(driver.getTitle());
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String time=new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        FileUtils.copyFile(src, new File("C:\\Users\\chkri\\git\\repository2\\Practice\\SeleniumPractice\\Screenshots\\Screenshots_" + time + ".png"));
        driver.quit();
	}

}
