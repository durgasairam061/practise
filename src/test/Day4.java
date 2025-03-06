package test;

import org.testng.annotations.Test;

public class Day4 extends Day3{
	@Test
	public void webloginHomeloan() {
		System.out.println("webloginHomeloan");
	}
	@Test(timeOut = 4000)
	public void mobileloginHomeloan() {
		System.out.println("mobileloginHomeloan");
	}
	@Test(enabled= false)
public void ApiloginHomeloan() {
	System.out.println("apiloginHomeloan");
		
	}
	@Test(dependsOnMethods= {"mobileloginHomeloan"})
	public void mobilesignoutHomeloan() {
		System.out.println("mobilesignoutHomeloan");
		
	}


}
