package test;

public class maxNumberInMatrixLeastNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{8,4,5},{3,4,7},{6,2,9}};
		int min= abc[0][0];
		int mincol=0;
		int max = abc[1][mincol];
		for (int i=0;i<3;i++) {
			                                                
			// 8 4 5
            // 3 8 7
			// 6 2 9
		
		for (int j=0;j<3;j++) {
	//		System.out.print(abc[i][j]);
			if(abc[i][j] < min) {
				min= abc[i][j];
				mincol=j;
				
			}
			
			
		}
	//	System.out.println(max);
		}
		
	//	int max = abc[1][mincol];
		//	System.out.println(max);
		if(	abc[1][mincol] > max) {
			max = abc[1][mincol];
	//	System.out.println(min);
		
	}
	
		System.out.println(max);
}
}