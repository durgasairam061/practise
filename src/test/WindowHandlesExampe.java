package test;

import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	Set<String> wh=	driver.getWindowHandles();
	Iterator<String>it =(Iterator<String>) wh.iterator();
    String	parentid =it.next();
    String	childid =it.next();
    driver.switchTo().window(parentid);
    
    ///// or 
    
    for(String window : driver.getWindowHandles()) {
    	driver.switchTo().window(window);
    	
    }

	}

}
