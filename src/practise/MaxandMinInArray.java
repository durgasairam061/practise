package practise;

import org.testng.annotations.Test;

public class MaxandMinInArray {

	@Test
	void test1() {
		  int a[]= {1,2,3,5};
		  int max=Integer.MIN_VALUE;
		  
		  for(int i:a) {
			  if(i>max)
				  max=i;
		  }
		  System.out.println(max);
	}
	
	@Test
	void test2() {
		  int a[]= {1,2,3,5};
		  int max=a[0];
		  
		  for(int i:a) {
			  if(i>max)
				  max=i;
		  }
		  System.out.println(max);
	}
	
	@Test
	void test3() {
		  int a[]= {0,1,2,3,5};
		  int min=a[0];
		  
		  for(int i:a) {
			  if(i<min)
				  min=i;
		  }
		  System.out.println(min);
	}


}
