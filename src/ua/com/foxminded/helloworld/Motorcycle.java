package ua.com.foxminded.helloworld;

import java.util.Objects;

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

	public void repair() {
		this.isReadyToDrive = true;
	}

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight=" + weight + ", color=" + color.value + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive + "]";
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
