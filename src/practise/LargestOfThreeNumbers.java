package practise;

import org.testng.annotations.Test;

public class LargestOfThreeNumbers {
	
	@Test
	void test1() {
		int a=10,b=40,c=30;
		if((a>b)&&(a>c)) {
			System.out.println("a is largest");
		}
		else if((b>a)&&(b>c)) {
			System.out.println("b is largest");
		}
		else {
			System.out.println("c is largest");
		}
	}
	
	@Test
	void test2() {
		// ternary operator
		int a=70,b=40,c=80;
		int larger1= a>b?a:b ;
		int largest= larger1>c?larger1:c ;
		System.out.println( largest);
		

	}

}
