package practise;

import org.testng.annotations.Test;

public class SumOfDigitsInNumber {
	
	@Test
	void test1() {
		int num =1234;
		int sum=0;
		while(num>0) {
			int rem= num%10;
			sum =sum+rem;
			num=num/10;
		}
		
		System.out.println(sum);
	}

}
