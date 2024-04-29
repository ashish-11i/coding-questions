package SortingArrayUsingDifferentWay;

import java.util.Arrays;

public class UsingArraysSortMethod {

	public static void main(String[] args) {
		
		int[] arr = {1,5,8,3,6};
		System.out.println("Original Array :");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nSorted Array :");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
