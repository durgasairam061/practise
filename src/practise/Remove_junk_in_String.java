package practise;

public class Remove_junk_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "2332*(@(E)!^@*@(( as ssdjciodossssncmcm";
	s=	s.replaceAll("[^a-zA-Z0-9]","");
System.out.println(s);
	}

}
