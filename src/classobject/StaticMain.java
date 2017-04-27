package classobject;

import java.util.ArrayList;

public class StaticMain {
	public static void main(String[] args) {

		ArrayList<Computer> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			list.add(new Computer());
		}

		for (Computer computer : list) {
			System.out.println(computer.getId());
		}
	}
}

class Computer {
	private int id;
	static int autoNumber;

	static {
		autoNumber = 100;
	}

	public Computer() {
		this.id = ++autoNumber;
	}

	public Computer(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
