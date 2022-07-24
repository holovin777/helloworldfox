package ua.com.foxminded.helloworld;

public class CombineManager {

	public static void main(String[] args) {

		// Control combines for service
		System.out.println("- Control combines for service");
		Combine combine1 = new Combine("LEXION 8000-5000", 1992);
		Combine combine2 = new Combine("Combi", 1800);
		combine1.addDistance(100001);
		combine1.addDistance(99000);
		System.out.println(combine1.name);
		System.out.println(combine1.isReadyToService());
		System.out.println(combine2.name);
		System.out.println(combine2.isReadyToService());

	}

}
