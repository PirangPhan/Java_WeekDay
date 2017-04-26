package polymorphism;

public class Shape {
	public void draw() {
		System.out.println("I am Shape");
	}
	
	public void print(){
		System.out.println("Print");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("I am Triangle");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("I am Rectangle");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("I am Circle");
	}
}

class Square extends Shape {

}
