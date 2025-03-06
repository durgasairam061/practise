package practise;

public class Removing_whiteSpaces_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "ram is a very good boy";
	str=	str.replaceAll("\\s", "");
	System.out.println(str);
	}

}
