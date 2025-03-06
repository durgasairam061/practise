package test;

import org.testng.annotations.Test;

public class Reusables {
	int i = 0;
	public Reusables(int i) {
	this.i=i;
	}
	@Test
	public int increment() {
		
		i=i+1;
		return i;
		
	}
	
	

}
