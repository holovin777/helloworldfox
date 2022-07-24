package ua.com.foxminded.helloworld;

import java.util.Objects;

public class Motorcycle extends Machine {

	int price;
	Color color;
	String engineType;
	boolean isReadyToDrive;
	private int distance = 0;

	public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType, boolean isReadyToDrive) {
		Color colorFiltred = Color.valueOf(color.replaceAll("\\s", "").toUpperCase());
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = colorFiltred;
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}

	public void repair() {
		this.isReadyToDrive = true;
	}

	public void destroyEngine() {
		this.isReadyToDrive = false;
	}

	public String isReadyToService() {

		if (distance >= 8000) {
			return "Is ready to service";
		} else {
			return "Service about " + (8000 - distance) + " km";
		}
	}

	public void addDistance(int additinalDistance) {
		if (additinalDistance > 0) {
			distance += additinalDistance;
			System.out.println(this.isReadyToService());
			if (distance >= 200000) {
				this.destroyEngine();
			}
		}
	}

	public void addDistance(double additinalDistance) {
		if (additinalDistance > 0) {
			distance += Math.round(additinalDistance);
			System.out.println(this.isReadyToService());
			if (distance >= 200000) {
				this.destroyEngine();
			}
			if (distance >= 10000) {
				this.isReadyToService();
			}
		}
	}

	public int getDistance() {
		return distance;
	}

	public void setColor(String color) {
		Color colorFiltred = Color.valueOf(color.replaceAll("\\s", "").toUpperCase());
		this.color = colorFiltred;
	}

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight=" + weight + ", color=" + color.value + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive + ", distance = " + distance  + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, engineType, isReadyToDrive);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return color == other.color && Objects.equals(engineType, other.engineType)
				&& isReadyToDrive == other.isReadyToDrive;
	}

}
