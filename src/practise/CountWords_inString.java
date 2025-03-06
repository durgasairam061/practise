package practise;

public class CountWords_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ram is a very good boy";
		int len=	str.length();
		int count=1;
		for (int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ')  && ( str.charAt(i+1)!= ' ')) {
				
				count++;
			}
		}
		 System.out.println(count);
		
	}

}
