package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day1 {
    
	@Test(dataProvider="getdata")
	public void demo(String User,String Password) {
		System.out.println("hi");
		
		}
	
	@Test(groups = "smoke")
	public void demoview() {
		System.out.println("demoview");
		
		}
	
	@BeforeTest
	public void beforedemo() {
		System.out.println("before demoview");
		
		}
	
	@BeforeMethod
	public void beforeMethoddemo() {
		System.out.println("beforeMethoddemo");
	
	}
	@DataProvider
	public Object[][] getdata() {
		Object [][] data= new Object[2][2];
		data[0][0]= "user";
		data[0][1]= "pwd";
		data[1][0]= "user2";
		data[1][1]= "pwd2";
		return data;
	}
}


