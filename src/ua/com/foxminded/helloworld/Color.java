package ua.com.foxminded.helloworld;

public enum Color {

	BLACK("Black"),
	ORANGE("Orange"),
	WHITE("White"),
	YELLOW("Yellow"),
	BLUE("Blue"),
	GREEN("Green");

	String value;
	Color(String value){
		this.value = value;
	}

}
