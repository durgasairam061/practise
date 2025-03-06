package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
			       TakesScreenshot ts = (TakesScreenshot)driver;
			    File src   = ts.getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(src, new File("./SeleniumScreenshots/Screen.png"));
		//	    return System.getProperty("./SeleniumScreenshots/Screen.png");
			    
			    
			    // partial or webelement scrrenshot
				WebElement drop = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
        File src1=  drop.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1, new File("logo.png"));
        
        // height and width of webelememnt
        
        drop.getRect().getDimension().getHeight();
        drop.getRect().getDimension().getWidth();

	}

}
