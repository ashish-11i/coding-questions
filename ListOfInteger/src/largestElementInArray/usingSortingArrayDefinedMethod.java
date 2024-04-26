package largestElementInArray;

import java.util.Arrays;

public class usingSortingArrayDefinedMethod {

	static int largestElement(int[] arr) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
//					int temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
					
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		return arr[0];
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,8,3,6};
		System.out.println("largestElement :- "+largestElement(arr));
	}
}
