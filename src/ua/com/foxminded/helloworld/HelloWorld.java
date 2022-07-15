package ua.com.foxminded.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		boolean evenNumber = false;
		long number = 5;
		for (long i = 0; i <= number; i += 2) {
			if (number == i) {
				evenNumber = true;
			}
		}
		System.out.println(evenNumber);
	}

}
