package test;

public class Consructor {
	
	public Consructor() {
		System.out.println("in constructor");
	}
	
	public Consructor(int a, int b) {
		System.out.println("in parameter constructor");
	}
	 
	public void getdata() {
		System.out.println("get data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consructor con  = new Consructor(2,3);
	}

}
