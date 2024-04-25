package staticVariable;

public class Counter {

	//Static variable initialize at the time of running project
	//If u use static variable then it will initialize only once and it will use in all the program until program close.
	//If u don't use as static then it will initialize each time when u create an object.
	static int count=0;
	
	void increment() {
		count++;
	}
	
	void display() {
		System.out.println("count :- "+count);
	}
}
