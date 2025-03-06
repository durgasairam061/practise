package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(date));
	System.out.println(date.toString());	
	}

}
