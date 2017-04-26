package classobject;

public class Person {
	int id;
	String name;
	int age;
	String gender;
	
	//static
	static String fullName;

	public Person(int id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
	}
	
	public Person(){
		this(10, "Sara", 30);
		this.gender = "Female";
	}
	
	

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void display(){
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
}
