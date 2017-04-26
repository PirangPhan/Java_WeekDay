package inheritance;

public class Car {
	int id = 1;
	protected String brand = "Default";
	private String color;
}

class Audi extends Car {
	String led;
	Engine engine;
}

class FakeCar extends Car {

}

class Engine {
	int id;
	int power;
}
