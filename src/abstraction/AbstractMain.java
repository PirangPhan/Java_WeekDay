package abstraction;

public class AbstractMain {
	public static void main(String[] args) {
		Vehicle car = new Car();
		car.showInfo();

		Movable bike = new Bike();
		bike.moveRight();

		Vehicle bike1 = new Bike();
		bike1.speed();

		Bike bike2 = ((Bike) bike1);
		bike2.showInfoInBike();
	}
}

abstract class Vehicle {
	private int id;
	private String brand;

	abstract void speed();

	void showInfo() {
		System.out.println(this.id + ", " + this.brand);
	}
}

interface MoveLeft {
	void moveLeft();
}

interface Movable extends MoveLeft {
	void moveRight();
}

class Car extends Vehicle implements Movable {
	@Override
	void speed() {
		System.out.println("I am a Car");
	}

	@Override
	public void moveLeft() {
		System.out.println("Car move Left");
	}

	@Override
	public void moveRight() {
		System.out.println("Car move Right");
	}
}

class Bike extends Vehicle implements Movable {

	@Override
	public void moveLeft() {
		System.out.println("Bike move Left");
	}

	@Override
	public void moveRight() {
		System.out.println("Bike move Right");

	}

	@Override
	void speed() {
		System.out.println("Bike Speed");
	}

	void showInfoInBike() {
		System.out.println("Info in Bike");
	}

}

abstract class Moto extends Vehicle implements MoveLeft {
	void showMotoInfo() {
		System.out.println("Moto Info");
	}
}

class Vespa extends Moto {

	@Override
	void speed() {
		// TODO Auto-generated method stub
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
	}

}
