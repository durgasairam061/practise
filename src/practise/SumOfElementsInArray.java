package practise;

import org.testng.annotations.Test;

public class SumOfElementsInArray {

	 @Test
		void test1() {
		// TODO Auto-generated method stub
		int sum=0;
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
   System.out.println(sum);
	}
	 

	 @Test
		void test2() {
		// TODO Auto-generated method stub
		int sum=0;
		int a[]= {1,2,3,4,5};
		for(int i:a) {
			sum=sum+i;
			
		}
   System.out.println(sum);
	}

}
