package nestedclass;

import nestedclass.Outer.Inner;

public class NestedClassMain {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.getName();
	}
}

class Outer {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void showInfo(){
		Inner i = new Inner();
		i.getName();
	}

	class Inner {
		private String name;

		public String getName() {
			return name + id;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
