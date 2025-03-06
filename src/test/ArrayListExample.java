package test;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList<String> al = new ArrayList<String>();
           al.add("sai");
           al.add("java");
           System.out.println(al);
           al.add(1, "ram");
           System.out.println(al);
           al.remove(2);
           System.out.println(al);
           System.out.println( al.indexOf("ram"));
           System.out.println( al.contains("ram"));
            System.out.println( al.size());
	}

}
