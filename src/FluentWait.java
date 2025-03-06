
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// explicit wait
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		// fluent wait-- >Wait Interface
		
	//	Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).with
		
//		Wait wait = new FluentWait()
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery((Duration.ofSeconds(2))
//				.ignoring(NoSuchElementException.class);
//
//				WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
//				public WebElement applyy(WebDriver driver) {
//				return driver.findElement(By.id("foo"));
//				}
		//		});

	}

	

	

}
