package basicprogramsgfg;

import java.util.Scanner;

public class FormatingPrintf {

	public static void main(String args[]) {
//		int num = 1000000;
//		System.out.printf("%,d%n", num);
//		System.out.printf("printed");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number :- ");
		int num = sc.nextInt();
		System.out.println((num %2) == 0 ?  "EVEN" : "ODD" );
		System.out.println((num & 1) == 0 ?  "EVEN" : "ODD" );
	}
}
