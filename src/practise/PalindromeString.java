package practise;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PalindromeString {
	@Test
	void test1() {
		String name= "lol";
		String rev="";
		
		int len =name.length();
		
		for(int i = len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("given stirng is palindrome");
		}
		
	}
	@Test
	void test2() {
		Scanner sc =new Scanner(System.in);
		String name=sc.next();
		String rev="";
		
		int len =name.length();
		
		for(int i = len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("given stirng is palindrome");
		}
	

}}
