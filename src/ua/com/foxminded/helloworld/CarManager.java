package ua.com.foxminded.helloworld;

public class CarManager {

	public static void main(String[] args) {

		Car car1 = new Car("Toyota Prius", 2008, 1200, 15000, Color.GREEN);
		Car car2 = new Car("Renault Laguna", 2000, 1600, 9700, Color.WHITE);

		System.out.println(car1);
		System.out.println(car2);

	}

}
