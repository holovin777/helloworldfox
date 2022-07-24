package ua.com.foxminded.helloworld;

public class Combine extends AgriculturalMachinery {

	public Combine(String name, int yearOfProduction) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
	}

	public boolean isReadyToService() {

		if (this.getDistanceOnService() > 100000) {
			return true;
		} else {
			return false;
		}

	}

	public int getDistanceOnService() {

		return this.getDistanceOnService();

	}

}
