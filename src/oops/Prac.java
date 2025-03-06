package oops;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Prac {

	public static void main(String[] args) {
	
//		WebDriver driver = new ChromeDriver();
//	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		driver.get("https://www.cricbuzz.com/");
//		driver.manage().window().maximize();
//		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'table')])[1]"))).click();
//	//	driver.findElement(By.xpath("(//a[contains(text(),'table')])[1]")).click();
//	
		
		// fluent wait
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
     	driver.manage().window().maximize();
        Wait<WebDriver>wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
        		.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class) ;
        
     WebElement ele= wait.until(new Function<WebDriver,WebElement>(){
            	public WebElement apply(WebDriver driver) {
            		return driver.findElement(By.xpath("(//a[contains(text(),'table')])[1]"));
            	}
            });
     ele.click();
	}

}
