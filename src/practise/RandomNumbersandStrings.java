package practise;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class RandomNumbersandStrings {
	
	 @Test
		void test1() {
		 // random class
		 Random rand=new Random();
	int random=	 rand.nextInt(100);  //10--> 0 to 9
	System.out.println(random);
	   
	System.out.println(rand.nextDouble());    //    0.0. to 1.0
	 }
	 
	 @Test
		void test2() {
		 // math class
		 //
		 System.out.println(Math.random()); //    0.0. to 1.0
	 }
	 
	 @Test
		void test3() {
		 // usng apache commons-lanng APi
		String random= RandomStringUtils.randomNumeric(5);
	String ran=	RandomStringUtils.randomAlphabetic(5);
	System.out.println(random);
	System.out.println(ran);
	 }

}
