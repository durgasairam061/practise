import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
//		WebElement drop = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
//		
//		drop.isDisplayed();
//		Select drp = new Select(drop);
//		drp.selectByIndex(3);
//		System.out.println(drp.getFirstSelectedOption().getText());
//		drp.selectByVisibleText("INR");
//		System.out.println(drp.getFirstSelectedOption().getText());
//		drp.selectByValue("AED");
//		System.out.println(drp.getFirstSelectedOption().getText());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
         WebElement elements= driver.findElement(By.xpath("//select[@id='country']"));
         Select ele = new Select(elements);
         ele.selectByIndex(5);
         ele.selectByValue("canada");
         driver.close();
	}
	

}
