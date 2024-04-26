package largestElementInArray;

public class Iterativemethod {

	static int largestElement(int[] arr) {
		int max=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[]arr = {1,5,3,8,9,15,12,13,14};
		System.out.println("largestElement :- "+largestElement(arr));
	}
}
