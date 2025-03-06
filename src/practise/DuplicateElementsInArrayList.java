package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class DuplicateElementsInArrayList {

	public static void main(String[] args) {

   int[]arr= {1,1,4,3,2,4,2,5,3,6,4,7,5,8,4,6,2,3,27,5,3,2,8,7};
   List<int[]> list =    Arrays.asList(arr);
    List <int[]> unique=  list.stream().distinct().collect(Collectors.toList());
      System.out.println(unique);
	}

}
