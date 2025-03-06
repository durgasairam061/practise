package practise;

import org.testng.annotations.Test;

public class Reverse_words_inString {

	@Test
	void test1() {
		// letters
		
		String str= "ram is a very good boy";
		String rev="";  
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);

	}
	@Test
	void test2() {
		String str= "ram is a very good boy";
		String [] words=str.split(" ");
		String rev=""; 
		for(String w:words) {
			String revwords=""; 
			for(int i=w.length()-1;i>=0;i--) {
				revwords=revwords+w.charAt(i);
			}
			rev=rev+revwords+" ";
		}
		System.out.println(rev);
	}
	@Test
	void test3() {
		String str= "ram is a very good boy";
		String [] words=str.split(" ");
		String rev=""; 
		for(String w:words) {
			String revwords=""; 
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			rev=rev+revwords+sb.toString()+" ";
		}
		System.out.println(rev);
	}

}
