package test;


import java.util.HashSet;
import java.util.Iterator;



public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<String > hs= new HashSet<String>();
       hs.add("ram");
       
   Iterator<String> it=  hs.iterator();
   it.next();
   it.hasNext();
      
	}

}
