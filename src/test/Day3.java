package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 

public class Day3 {
	@Parameters({"url"})
	@Test
	public void weblogincarloan(String urlvalue) {
		System.out.println("weblogincarloan");
		System.out.println(urlvalue);
		
	}
	@Test
	public void mobilelogincarloan() {
		System.out.println("mobilelogincarloan");
	}
	@Test(groups ="smoke")
public void Apilogincarloan() {
	System.out.println("apilogincarloan");
		
	}

}
