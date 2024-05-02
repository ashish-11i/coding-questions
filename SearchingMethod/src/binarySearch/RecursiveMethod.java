package binarySearch;

public class RecursiveMethod {
	
	static int recursiveApproach(int[] arr, int beg, int end, int searchKey) {
		
		if(beg<=end) {
			int mid = (beg+end)/2;
			if(arr[mid]==searchKey) {
				return mid;
			}
			if(mid<searchKey) {
				return recursiveApproach(arr, mid+1, end, searchKey);
			}else {
				return recursiveApproach(arr, beg, mid-1, searchKey);
			}
		}
		
		return -1;
	}

	static int binarySearch(int[] arr, int size, int searchKey) {
		
		int beg = 0;
		int end = size-1;
		return recursiveApproach(arr,beg, end, searchKey);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr, arr.length, 9));
	}
}
