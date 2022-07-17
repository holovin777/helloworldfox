package ua.com.foxminded.helloworld;

import java.util.Objects;

public class Car {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance;

	public Car(String name, int yearOfProduction, int price, int weight, Color color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}
	
	public void addDistance(int additinalDistance) {
		distance += additinalDistance;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight=" + weight + ", color=" + color.value + "]";
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
