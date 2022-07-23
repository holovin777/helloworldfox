package ua.com.foxminded.helloworld;

import java.util.Objects;

public abstract class Car extends Machine implements Serviceable {

	int price;
	Color color;
	private double distance = 0;
	protected int distanceOnService = 0;
	

	public Car(String name, int yearOfProduction, int price, int weight, Color color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}
	
	public void addDistance(int additinalDistance) {
		if (additinalDistance > 0) {
			distance += additinalDistance;
			distanceOnService += additinalDistance;
		}
	}

	public void addDistance(double additinalDistance) {
		if (additinalDistance > 0) {
			distance += additinalDistance;
			distanceOnService += additinalDistance;
		}
	}

	public double getDistance() {
		return distance;
	}

	public void service() {
		distanceOnService = 0;
	}

	@Override
	public String toString() {
		return "Car [name = " + name + ", yearOfProduction = " + yearOfProduction + ", price = " + price + ", weight = " + weight + ", color = " + color.value + ", distance = " + distance + ", distanceOnService = " + distanceOnService + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price, weight, yearOfProduction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return color == other.color && Objects.equals(name, other.name) && price == other.price
				&& weight == other.weight && yearOfProduction == other.yearOfProduction;
	}

}
