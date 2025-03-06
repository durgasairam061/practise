package practise;

public class MinNuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,45,283,5,2774,949,-1,-263,-362,-368};
		int min = Integer.MAX_VALUE;
		
		for ( int i : arr) {
		if(	i<min)
		{min=i;		
			}
		}
         System.out.println(min);
	}

}
