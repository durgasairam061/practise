package practise;

public class MaxNuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,45,283,5949,2774,949};
		int max= Integer.MIN_VALUE;
		
		 System.out.println(max);
		for(int i:arr) {
			if (i>max) {
				max=i;
			}
			
		}
		 System.out.println(max);
	}

}
