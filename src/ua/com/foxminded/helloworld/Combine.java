package ua.com.foxminded.helloworld;

public class Combine extends AgriculturalMachinery {

	isReadyToService() {

		if (distanceOnService > 100000) {
			return true;
		} else {
			return false;
		}

	}

}
