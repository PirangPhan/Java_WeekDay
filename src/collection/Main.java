package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(0, 4);
		intList.add(0, 5);
		intList.remove(intList.size() - 1);

		for (Integer integer : intList) {
			System.out.println("IntList -> " + integer);
		}

		System.out.println("--------");
		ArrayList<Integer> totalIntList = new ArrayList<>();
		totalIntList.addAll(intList);
		for (Integer integer : totalIntList) {
			System.out.println("TotalIntList -> " + integer);
		}
		
		System.out.println("LinkList ------");
		List<Student> studentList = new LinkedList<>();
		for (int i = 0; i < 100; i++) {
			studentList.add(0, new Student(i+1, "Student " + (i+1)));
		}
		
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			System.out.println(student.toString());
		}
		
		System.out.println(studentList.get(50).toString());	
		


	}
}

class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
