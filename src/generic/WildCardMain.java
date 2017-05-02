package generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardMain {
	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		
		ArrayList<Float> floatList = new ArrayList<>();
		floatList.add(5.5f);
		
		printArray(integerList);
		printArray(floatList);
		
		
	}
	
	static void printArray(List<? extends Number> list){
		for (Number i : list) {
			System.out.println(i);
		}
	}
}
