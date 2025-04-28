package day21042025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement Stadropdown= driver.findElement(By.id("dropdown-class-example"));
        Select dropdown= new Select(Stadropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("option2");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("Option1");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        driver.quit();

	}

}
