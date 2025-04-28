package day21042025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
	}

}
