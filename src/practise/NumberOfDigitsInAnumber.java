package practise;

import org.testng.annotations.Test;

public class NumberOfDigitsInAnumber {
     @Test
	void test1() {
		// TODO Auto-generated method stub
		
		int num = 125694;
		int count=0;
		
		while(num!=0) {
			num=num/10;;  
			 count++;
		}
		
		 System.out.println(count);
	}
    

	

}
