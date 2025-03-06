import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fromTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://www.spicejet.com/");
	     driver.manage().window().maximize();
	     
	  driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).click(); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[normalize-space()='Vijayawada International Airport']")).click(); 
	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("//input[@value='Select Destination']")).click(); 
//	  Thread.sleep(1000);
	  driver.findElement(By.xpath(" //div[normalize-space()='Goa(Dabolim) International Airport']")).click(); 
		
		
	     
	   
	     
	  

	}

}
