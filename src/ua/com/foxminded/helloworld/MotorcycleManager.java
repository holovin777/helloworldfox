package ua.com.foxminded.helloworld;

public class MotorcycleManager {

	public static void main(String[] args) {

		Motorcycle moto1 = new Motorcycle("Suzuki GSX-R1000", 2021, 1600, 600, " black", "diesel", true);
		Motorcycle moto2 = new Motorcycle("Yamaha  FZ1", 2007, 9000, 700, "orangE ", "gas", false);

		// Add distance
		System.out.println("- Add distance");
		moto1.addDistance(250000);
		System.out.println(moto1);

		// Motorcycle equals
		System.out.println("- Motorcycle equals");
		System.out.println(moto1.equals(moto2));

		// Repair moto2
		System.out.println("- Repair moto2");
		moto2.repair();
		System.out.println(moto2);
		
		// Set color for moto2
		System.out.println("- Set color for moto2");
		moto2.setColor("blue");
		System.out.println(moto2);

		// Repair moto1
		System.out.println("- Repair moto1");
		moto1.repair();
		System.out.println(moto1);

		// Set color
		System.out.println("- Set color for moto2");
		moto2.setColor("black");
		System.out.println(moto2);

		// Print motorcycles
		System.out.println("- Print motorcycles");
		System.out.println(moto1);
		System.out.println(moto2);

		// Add float distance
		System.out.println("- Add float distance");
		moto1.addDistance(11.5);
		System.out.println(moto1);

		// Test isReadyToService method
		System.out.println("- Test isReadyToService method");
		moto2.addDistance(20);

	}

}
