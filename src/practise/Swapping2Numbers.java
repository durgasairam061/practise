package practise;

import org.testng.annotations.Test;

public class Swapping2Numbers {
	@Test
	void test1() {
		
		int a=10,b=20;
		
		int c=a;
		a=b;
		b=c;
		System.out.println(a +"  "+b);
		
	}
	
	@Test
	void test2() {
		
		int a=10,b=20;
		
		a=a+b;  //30
		b=a-b;  // 10
		a=a-b;
		
		System.out.println(a +"  "+b);
	}
	
	@Test
	void test3() {
		
		int a=10,b=20;
		
		a=a*b;    // 200
		b=a/b;    //  10
		a=a/b;
		
		System.out.println(a +"  "+b);
	}
	
	@Test
	void test4() {
		
		int a=10,b=20;
		
	b=   a+b-(a=b);
		
		System.out.println(a +"  "+b);
	}


}
