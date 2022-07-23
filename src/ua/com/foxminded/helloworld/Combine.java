package ua.com.foxminded.helloworld;

public class Combine extends AgriculturalMachinery {

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
