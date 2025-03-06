import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://jqueryui.com/datepicker/");
			driver.manage().window().maximize();
			driver.switchTo().newWindow(WindowType.TAB);  // opening new tab
			driver.get("https://www.google.com");
	}

}
