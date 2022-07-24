package ua.com.foxminded.helloworld;

public class Combine extends AgriculturalMachinery implements Serviceable {

	private int distance = 0;
	protected int distanceOnService = 0;

	public Combine(String name, int yearOfProduction) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
	}

	@Override
	public void addDistance(int additinalDistance) {
		if (additinalDistance > 0) {
			distance += additinalDistance;
			distanceOnService += additinalDistance;
		}
	}

	@Override
	public int getDistance() {
		return distance;
	}

	@Override
	public boolean isReadyToService() {

		if (this.getDistanceOnService() > 100000) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int getDistanceOnService() {

		return this.getDistanceOnService();

	}

	@Override
	public void service() {
		distanceOnService = 0;
	}

	public static void main(String[] args) {
		Combine combine1 = new Combine("LEXION 8000-5000", 1992);
		System.out.println(combine1.name);
	}

}
