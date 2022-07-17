package ua.com.foxminded.helloworld;

public class Motorcycle {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	String engineType;
	boolean isReadyToDrive;

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

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight=" + weight + ", color=" + color.value + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive + "]";
	}

}
