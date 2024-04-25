package staticVariable;

public class Main {

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		counter1.increment();
		counter1.display();
		counter2.increment();
		counter2.display();
	}
}
