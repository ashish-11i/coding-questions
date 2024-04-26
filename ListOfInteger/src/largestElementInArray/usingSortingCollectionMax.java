package largestElementInArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class usingSortingCollectionMax {

	public static void main(String[] args) {
		
		int [] arr = {1,5,8,3,6};
		List<Integer> list = new ArrayList<>();
		for(int i : arr) {
			list.add(i);
		}
		
		System.out.println("Largest Element :- "+Collections.max(list));
	}
}
