import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://jqueryui.com/datepicker/");
			driver.manage().window().maximize();
			
			driver.switchTo().frame(0);
	//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("18/03/2025");
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			
			String month = "March";
			String Date = "18";
			String year = "2026";
			
			while(true) {
			String curmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(curmonth.equals(month) && curyear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
			for(WebElement date:dates) {
				if(Date.equals(date.getText())) {
					date.click();
					break;
				}
			}
			
	}

}
