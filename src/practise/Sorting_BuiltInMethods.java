package practise;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class Sorting_BuiltInMethods {

	@Test
	void test1() {
		// TODO Auto-generated method stub
		  int a[]= {4,2,5,1,3};
		  System.out.println(Arrays.toString(a));
		  // parallel sort
		  Arrays.parallelSort(a);
		  System.out.println(Arrays.toString(a));
	}
	
	@Test
	void test2() {
		// TODO Auto-generated method stub
		  int a[]= {4,2,5,1,3};
		  System.out.println(Arrays.toString(a));
		 Arrays.sort(a);
		  System.out.println(Arrays.toString(a));
	}
	
	@Test
	void test3() {
		// reverse order sort
		  Integer a[]= {4,2,5,1,3};
		  System.out.println(Arrays.toString(a));
		 Arrays.sort(a,Collections.reverseOrder());
		  System.out.println(Arrays.toString(a));
	}


}
