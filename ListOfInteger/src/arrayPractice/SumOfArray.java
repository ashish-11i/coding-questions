package arrayPractice;

import java.util.Arrays;

public class SumOfArray {
	
	int sum=0;
	//it is called foreach - iterate over an array or iterable. 
	int usingForEach(int[] arr) {
		
		for (int i : arr) {
			sum +=i;
		}
		return sum;
		
	}
	
	//Using inbuilt method sum
	int usingStreamAPI(int []arr) {
		sum = Arrays.stream(arr).sum();
		return sum;
	}
	
	//Using Recursion
	int usingRecursion(int[] arr, int size) {
		if(size==0) {
			return arr[size];
		}
		
		return arr[size-1]+usingRecursion(arr, size-1);
	}
	
	
	//Use index on array
	int usingArrayIndex(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			
			sum+=arr[i];
			
		}
		return sum;
	}
	

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int []arr1 = {1,2,3,4,5};
		
		SumOfArray s1 = new SumOfArray();
		SumOfArray s2 = new SumOfArray();
		SumOfArray s3 = new SumOfArray();
		SumOfArray s4 = new SumOfArray();
		
		System.out.println("sum1 :- "+s1.usingForEach(arr));
		
		System.out.println("usingForEach Sum1:- "+s1.usingForEach(arr));
		System.out.println("usingStreamAPI Sum2:- "+s2.usingStreamAPI(arr));
		System.out.println("usingRecursion Sum3:- "+s3.usingRecursion(arr,5));
		System.out.println( "usingArrayIndex Sum4:- "+s4.usingArrayIndex(arr));
//		Static variable initialize once at the time of running project
//		NOTE - Please check only creating one object and call all the methods using global variable
//		Call methods using different objects or same object as creating static variable
	}
}
