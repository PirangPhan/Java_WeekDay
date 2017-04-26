package controlflow;

public class Main {
	public static void main(String[] args) {
		
		int age = 18;
		
		String str = (age >= 18) ? "Ok" : "No";
		System.out.println(str);
		
		System.out.println("------------------");
		
		if(str instanceof String) {
			System.out.println("It's a string");
		} else {
			System.out.println("Wrong type");
		}
		
		
		
		
		
		
	}
}
