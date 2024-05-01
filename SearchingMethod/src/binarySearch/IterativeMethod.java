package binarySearch;

public class IterativeMethod {
	
	public static int binarySearch(int[] arr, int size, int searchElem) {
		
		int low = 0;
		int high = size-1;
		
		while(low<=high) {
			
			int mid = low+(high-low)/2;
			
			if(arr[mid]==searchElem) {
				return mid;
			}
			if(mid<searchElem) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		 int arr[] = { 2, 3, 4, 10, 40 };
		 int searchElem = 110;
		 System.out.println("searching element "+searchElem+" is at index "+binarySearch(arr, arr.length, searchElem));
//		 binarySearch(arr, arr.length, searchElem);
	}

}
