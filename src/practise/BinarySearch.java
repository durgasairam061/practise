package practise;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		 int low=0;
		 int high=a.length-1;
		 int mid=(low+high)/2;
		 int key = 7;
		
		 if(key>mid) {
			 for(int i=a[mid-1];i<a.length;i++) {
	                if(key==a[i]){
					 System.out.println(i);
					 System.out.println("match found in the right side");
				 } 
			 }
		 }
		 if(key<mid) {
			 for(int i=a[0];i<a[mid];i++) {
				 if(a[i]==key){
					 System.out.println(i);
					 System.out.println("match found in the left side");
				 } 
			 }
		 }
        if(key==mid) {
        	
        	 System.out.println("match found in the middle");
        }
	}

}
