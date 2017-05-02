package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
	public static void main(String[] args) {
		Map<String, Integer> param = new HashMap<>();
		param.put("one", 1);
		param.put("two", 2);
		param.put("three", 3);
		
		System.out.println(param.get("two"));
		
		param = new TreeMap<>();
		param.put("four", 4);
		System.out.println(param.get("four"));
	}
}
