package practise;

import java.util.HashSet;

import org.testng.annotations.Test;

public class DuplicateElementsInArray {

	@Test
	void test1() {
		// TODO Auto-generated method stub
		boolean flag=false;
		String str[]= {"ram","syam","rahul","ram"};
		 for(int i=0;i<str.length;i++) {
			 for(int j=i+1;j<str.length;j++) {
				 if(str[i]==str[j]) {
					 System.out.println("duplicated");
					 flag=true;
				 }
			 }
			
		 }
		 if(flag==false) {
			 System.out.println("not duplicated");
		 }
	}
	
	@Test
	void test2() {
		// TODO Auto-generated method stub
		String str[]= {"ram","syam","rahul","ram"};
		HashSet hs= new HashSet();
		
		for(String val:str) {
			 System.out.println(	hs.add(val));
		}
		
	}
	

}
