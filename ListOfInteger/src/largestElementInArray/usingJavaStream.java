package largestElementInArray;

import java.util.Arrays;

public class usingJavaStream {

	
	
	static int largestElement(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,3,8,9,15,12,13,14};
		System.out.println("largestElement :- "+largestElement(arr));
	}
}
