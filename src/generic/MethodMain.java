package generic;

public class MethodMain {
	public static void main(String[] args) {
		
		String[] strs = {"A", "B"};
		Integer[] integers = {1, 2, 3};
		Util.printArray(strs);
		Util.printArray(integers);
	}
}

class Util {
	public static <E> void printArray(E[] elements) {
		for (E e : elements) {
			System.out.println(e);
		}
	}
}
