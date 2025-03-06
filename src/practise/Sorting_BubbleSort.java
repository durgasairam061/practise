package practise;

import java.util.Arrays;

public class Sorting_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {4,2,5,1,3};
         int len=a.length;
         System.out.println(Arrays.toString(a));
        for(int i=0;i<len-1;i++) {     // no of passes
        	for(int j=0;j<len-1;j++) {
        		if(a[j]>a[j+1]) {
        			int temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        		}
        	}
        }
        System.out.println(Arrays.toString(a));
	}

}
