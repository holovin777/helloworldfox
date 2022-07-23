package ua.com.foxminded.helloworld;

public class CarManager {

	public static void main(String[] args) {

		PassengerCar car1 = new PassengerCar("Toyota Prius", 2008, 1200, 15000, Color.GREEN);
		Bus car2 = new Bus("Renault Laguna", 2000, 1600, 9700, Color.WHITE);
		Car car3 = new Car("Renault Laguna", 2000, 1600, 9700, Color.WHITE);

		car1.addDistance(1000);
		car1.addDistance(2000);

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car2.equals(car3));
		System.out.println(car1.getDistance());

		// Add float distance
		car1.addDistance(10.3);
		System.out.println(car1);

	}

}
