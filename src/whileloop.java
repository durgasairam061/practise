import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class whileloop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
     driver.get("https://www.spicejet.com/");
     driver.manage().window().maximize();
 //    WebDriverWait wait = new WebDriverWait(driver, 7);
     
//     wait.until(ExpectedConditions.elementToBeClickable(ele);
//    WebElement ele= driver.findElement(By.cssSelector("div[class='css-1dbjc4n'] div div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'] div[class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
     Thread.sleep(2000);
     int i=1;
     while(i<6) {
     driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();
     i++;
     }
     driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();  
	
    for(i=1;i<6;i++) {
    	
    }
	}}
