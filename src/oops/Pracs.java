package oops;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pracs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Set<String> ids = driver.getWindowHandles();
		List list = new ArrayList(ids);
		System.out.println(list.get(0));
		System.out.println(list.get(1));

	}

}
