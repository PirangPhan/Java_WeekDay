package classobject;

public class ConstructorMain {
	public static void main(String[] args) {
		
		Person p = new Person(1, "Dara", 20);
		p.display();
		
		Person p1 = new Person(2, "Sok", 25, "Male");
		p1.display();
		
		Person p2 = new Person();
		p2.id = 100;
		p2.name = "John";
		p2.age = 99;
		p2.display();
		
		System.out.println("--------");
		
		Person p3 = new Person();
		p3.display();
		
		System.out.println("---------");
		Person p4 = new Person();
		
	}
}
