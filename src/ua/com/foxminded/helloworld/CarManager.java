package ua.com.foxminded.helloworld;

public class CarManager {

	public static void main(String[] args) {

		// Create new objects
		System.out.println("- Create new objects");
		PassengerCar car1 = new PassengerCar("Toyota Prius", 2008, 1200, 15000, Color.GREEN);
		Bus car2 = new Bus("Renault Laguna", 2000, 1600, 9700, Color.WHITE);
		Car car3 = new Car("Renault Laguna", 2000, 1600, 9700, Color.WHITE);

		// Add distance
		System.out.println("- Add distance");
		car1.addDistance(1000);
		car1.addDistance(2000);
		System.out.println(car1);
		System.out.println(car2);

		// Object equals
		System.out.println("- Object equals");
		System.out.println(car2.equals(car3));
		System.out.println(car1.getDistance());

		// Add float distance
		System.out.println("- Add float distance");
		car1.addDistance(10.3);
		System.out.println(car1);

		// Call service method
		System.out.println("- Call service method");
		car1.service();
		System.out.println(car1);

		// Call isReadyToDrive method
		System.out.println("- Call is ReadyToDrive method");
		car1.addDistance(10001);
		car2.addDistance(10001);
		System.out.println(car1.isReadyToService());
		System.out.println(car2.isReadyToService());
		System.out.println(car3.isReadyToService());

	}

}
