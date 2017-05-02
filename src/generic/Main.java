package generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		ArrayUtil<String> util = new ArrayUtil<>();
		util.setList(list);
		util.showItemList();
		
		ArrayUtil<Integer> intUtil = new ArrayUtil<>();
		intUtil.setList(intList);
		intUtil.showItemList();
	}
}

class ArrayUtil<T> {
	private ArrayList<T> list;

	public ArrayList<T> getList() {
		return list;
	}

	public void setList(ArrayList<T> list) {
		this.list = list;
	}
	
	public void showItemList(){
		for (T item : list){
			System.out.println(item);
		}
	}
	
	
}
