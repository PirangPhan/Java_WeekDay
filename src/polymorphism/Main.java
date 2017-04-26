package polymorphism;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		System.out.println("-----");
		
		Circle circle = new Circle();
		circle.draw();
		System.out.println("-----");
		
		Square square = new Square();
		shape.draw();
		System.out.println("-----");
		
		Shape x = new Rectangle();
		x.draw();
		System.out.println("-----");
		
		x = new Triangle();
		x.print();
		System.out.println("-----");
		
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Rectangle());
		list.add(new Square());
		list.add(new Shape());
		
		for (Shape item : list) {
			item.draw();
		}
		
		
		
	}
}
