package practise;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseAnumber {
	
	@Test
	void test1() {
		Scanner sc= new Scanner(System.in);
	int num=	sc.nextInt();
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		
	}
	System.out.println(rev);
	}
	
	@Test
	void test2() {
		 Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		// using StringBuffer class
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));   // changing num to string format
		StringBuffer rev =sb.reverse();
		
		System.out.println(rev);
	}
	
	@Test
	void test3() {
		 Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		// using StringBuilder class
		
		StringBuilder sbl= new StringBuilder();  
		sbl.append(num);
		StringBuilder rev =sbl.reverse();
		
		
		
		System.out.println(rev);
	}

}
