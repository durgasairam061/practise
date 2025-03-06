package practise;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,7,5,3,4};
		 int search=9;
		 boolean flag=false;
		 for(int i=0;i<a.length;i++) {
			
			 if(a[i]==search) {
				 System.out.println(i);   // index
				 System.out.println("match found");
				 flag=true;
				 break;
			 }
		 }
		 
		 if(flag==false) {
			 System.out.println("match not  found");
		 }
	}

}
