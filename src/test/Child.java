package test;

import org.testng.annotations.Test;

public class Child 
{

	@Test
	public void test()
{ 
		Reusables res =new Reusables(5);
		int i=8;
		res.increment();
 
        System.out.println(res.increment());
		}
}
