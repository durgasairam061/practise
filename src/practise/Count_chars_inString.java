package practise;

public class Count_chars_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ram is a very good boy";
	int len=	str.length();
	     str= str.replaceAll("a", "");
	     int len1=	str.length();
	     System.out.println(len-len1);
	}

}
