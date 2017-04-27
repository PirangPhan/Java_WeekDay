package polymorphism;

public class Shape {
	
	private int width;
	private int height;

	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public void draw() {
		System.out.println("I am Shape");
	}
	
	public void print(){
		System.out.println("Print");
	}
}

class Triangle extends Shape {
	
	Triangle(){
		super(1, 2);
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("I am Triangle");
	}
}

class Rectangle extends Shape {
	
	Rectangle(){
		super(3,4);
	}
	
	@Override
	public void draw() {
		System.out.println("I am Rectangle");
	}
}

class Circle extends Shape {
	
	Circle(){
		super(3,4);
	}
	
	@Override
	public void draw() {
		System.out.println("I am Circle");
	}
}

class Square extends Shape {
	Square(){
		super(5,6);
	}
}
