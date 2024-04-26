package largestElementInArray;

import java.util.Arrays;

public class sortingUsingPreDefinedMethod {

	
	
	public static void main(String[] args) {
	
		int[] arr = {1,5,8,3,6};
		
		Arrays.sort(arr);
		System.out.println("largest element :- "+arr[arr.length-1]);
	}
}
