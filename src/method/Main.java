package method;

public class Main {
	public static void main(String[] args) {
		print("Apple", "Samsung");
	}
	
	// Var Arguments
	static void print(String... strings){
		if (strings.length != 0) {
			for (String s: strings){
				System.out.println(s);
			}
		} else {
			System.out.println("No Arg");
		}
	}
	
	void printMsg(){
		System.out.println("Msg");
	}
	
	int showResult(){
		return 1 + 2;
	}
}
