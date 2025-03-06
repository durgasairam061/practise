package practise;

import java.util.Arrays;

import org.testng.annotations.Test;

public class COmparingDiffArrays {
	
	 @Test
		void test1() {
		 
		 int a[]= {1,2,3,5};
		 int b[]= {1,2,3,5};
		 
		 // arrays method
		 
	boolean status=	 Arrays.equals(a, b);
		 
		if(status==true)
		 System.out.println("matched");
		else
			System.out.println("no match");
	 }
	 
	 @Test
		void test2() {
		 
		 int a[]= {1,2,4,5};
		 int b[]= {1,7,3,5};
		 // checking both arrays have same length
		 boolean status=true;
		
		if(a.length==b.length) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				status=false;
			}else 
				status=true;
		}
		}
		else {
			status=false;
		}
		if(status==true) {
			System.out.println("arrays are equal");
		}else {
			System.out.println("arrays are not equal");
			}
			
			
	 }

	 }
