package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.switchTo().frame(0);  // index
		driver.switchTo().frame("childframe");   // String
		driver.switchTo().frame(driver.findElement(By.id(""))); // webelement
		driver.switchTo().defaultContent();
		
		// to check how many frmaes
		driver.findElements(By.tagName("iframe")).size();

	}

}
