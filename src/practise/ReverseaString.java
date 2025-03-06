package practise;

import org.testng.annotations.Test;

public class ReverseaString {

	@Test
	void test1()  {
		// TODO Auto-generated method stub
		
		String name= "sai";
		StringBuffer buf =new StringBuffer(name);
		System.out.println(buf.reverse());

	}
	@Test
	void test2() {
		
		// using String concatination operation
		String name= "ram";
		String rev = "";
		int len= name.length();
		
		for(int i = len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println(rev);
	}
	@Test
	void test3() {
		
		// using String concatination operation
		String name= "deepu";
		String rev = "";
		char a[]=name.toCharArray();
		int len= name.length();
		
		
		for(int i = len-1;i>=0;i--) {
			rev=rev+a[i];
			
		}
		System.out.println(rev);

	}

}
