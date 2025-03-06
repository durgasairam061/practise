import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://testautomationpractice.blogspot.com/");
      //    driver.findElement(By.xpath("//input[@id='sunday']")).click();
     List<WebElement> boxes=  driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
//          for (WebElement box:boxes) {
//        	  box.click();
//          }
          for(int i =0;i<boxes.size();i++) {
        	  boxes.get(i).click();
          }
	}

}
