package basicprogramsgfg;

import java.util.Scanner;

public class ReadingInputScanner {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String nextLine = sc.nextLine();
		int nextInt = sc.nextInt();
		
		System.out.println("number:- "+nextInt);
		
		String readLine = System.console().readLine();
		System.out.println("readLine :- "+readLine);
	}
}
