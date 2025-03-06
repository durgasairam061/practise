import java.util.ArrayList;

import org.bouncycastle.util.Arrays;

public class javaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] num= {2,3,5,8,1,23,56,47,302,205,200,213};
//		
//		for(int i=0;i<num.length;i++) {
//			if (num[i]%2 == 0 ) {
//				System.out.println(num[i]);
//			}
//			else {
//				System.out.println("value is not "+num[i]);
//			}
//		}

       ArrayList<String> a =new ArrayList<String>();
       a.add("sai");
       a.add("ram");
       a.add("ramu");
  //     System.out.println(a.get(0));
       
       for(int i=0;i<a.size();i++)
       {
    	   System.out.println(a.get(i));
       }
     for(String s:a) {
    	 System.out.println("new "+s);
     }
     System.out.println( a.contains("sai"));
   
	}
	
	String [] names= {"ram","shyam","roy","ash"};
	

}
