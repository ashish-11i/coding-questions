package linearSearch;

public class IterativeMethod {
	
	static int iterativeApproach(int[] arr, int searchKey) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==searchKey) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int searchKey=6;
		System.out.println("searchKey at index: "+iterativeApproach(arr, searchKey));
		
	}

}
