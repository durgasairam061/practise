
public class javaDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "welcome to java";
		String[] array =name.split("to");
		for(String s:array) {
			System.out.println(s);
			
		}
		
		System.out.println(array[1].trim());
//		 for(int i=0;i<name.length();i++) {
//			 {
//		 }
		 
		 for(int i1=name.length()-1;i1>=0;i1--) {
			 System.out.println(name.charAt(i1));
			 }
		 }
		 

	

}
