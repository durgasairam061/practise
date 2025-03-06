package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions a= new Actions(driver);
		a.moveToElement(null).build().perform();
		a.keyDown(Keys.SHIFT).sendKeys("hi").build().perform();
		a.doubleClick().build().perform();
	}

}
