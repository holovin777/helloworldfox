package ua.com.foxminded.helloworld;

public class Car {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;

	public Car(String name, int yearOfProduction, int price, int weight, Color color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight=" + weight + ", color=" + color.name().toLowerCase() + "]";
	}

}
