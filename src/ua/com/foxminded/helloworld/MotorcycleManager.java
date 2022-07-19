package ua.com.foxminded.helloworld;

public class MotorcycleManager {

	public static void main(String[] args) {

		Motorcycle moto1 = new Motorcycle("Suzuki GSX-R1000", 2021, 1600, 600, " black", "diesel", true);
		Motorcycle moto2 = new Motorcycle("Yamaha  FZ1", 2007, 9000, 700, "orangE ", "gas", false);

		// Add distance
		moto1.addDistance(250000);
		System.out.println(moto1);

		// Motorcycle equals
		System.out.println(moto1.equals(moto2));

		// Repair moto2
		moto2.repair();
		System.out.println(moto2);
		
		// Set color
		moto2.setColor("blue");
		System.out.println(moto2);

		// Repair moto1
		moto1.repair();
		System.out.println(moto2);

		// Set color
		moto2.setColor("black");
		System.out.println(moto2);

		// Print motorcycles
		System.out.println(moto1);
		System.out.println(moto2);

	}

}
