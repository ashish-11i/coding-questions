package linearSearch;

public class RecursiveMethod {
	
	private static int recursiveApproach(int[] arr, int searchKey, int index) {
		
		if(arr[index]==searchKey) {
			return index;
		}else {
			return recursiveApproach(arr, searchKey, index+1);
		}
	}
	

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searchKey = 6;
		int index=0;
		System.out.println("searchKey at index: " + recursiveApproach(arr, searchKey, index));

	}

}
