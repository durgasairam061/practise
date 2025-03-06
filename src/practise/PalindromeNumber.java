package practise;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PalindromeNumber {

	@Test
	void test1() {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
//		int num=123321;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
       System.out.println(rev);
       if(rev==num) {
    	   System.out.println("given number is palindrome");
       }
      
	}

}
