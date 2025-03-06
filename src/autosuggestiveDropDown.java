import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
//			driver.findElement(By.id("autosuggest")).click();
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
			List<WebElement> items = driver.findElements(By.xpath("//li[@role='presentation']"));
			for(WebElement item:items) {
				if(item.getText().equalsIgnoreCase("india")) {
					item.click();
					break;
				}
			}
	}

}
