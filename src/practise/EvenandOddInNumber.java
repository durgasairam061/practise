package practise;

import org.testng.annotations.Test;

public class EvenandOddInNumber {
	
	 @Test
		void test1() {
		 int num=57948569;
		 int even=0;
		 int odd=0;
		 
		 while(num>0) {
		int	rem=num%10;
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}
			num=num/10;   // eliminates last digit
		 }
		 System.out.println(even+"    "+odd);
	 }

}
