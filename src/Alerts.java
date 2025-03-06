import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://the-internet.herokuapp.com/javascript_alerts");
         driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        // driver.switchTo().alert().accept();
      Alert myalert =driver.switchTo().alert();
      myalert.accept();
         
         
	}

}
