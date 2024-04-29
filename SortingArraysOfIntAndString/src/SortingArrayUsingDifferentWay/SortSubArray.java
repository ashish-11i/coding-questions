package SortingArrayUsingDifferentWay;

import java.util.Arrays;
import java.util.Collections;

public class SortSubArray {

	static void sortSubArrayAscOrder(int[] arr) {
		// ByDefault AscendingOrder
		Arrays.sort(arr, 3, 8);
		System.out.println("\nSorted Array :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	void sortSubArrayDescOrder(int[] arr) {
		Arrays.sort(arr);
		System.out.println("\nSorted Array :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Integer[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 100 };
		 
        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(arr1, Collections.reverseOrder());
	}

	public static void main(String[] args) {

		int[] arr = { 1, 8, 5, 3, 6, 15, 13, 12, 11 };

		System.out.println("Original Array :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		sortSubArrayAscOrder(arr);

	}

}
