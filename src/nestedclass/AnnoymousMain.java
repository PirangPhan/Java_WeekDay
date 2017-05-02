package nestedclass;

public class AnnoymousMain {
	public static void main(String[] args) {
		Post c = new Post() {
			@Override
			void showContent() {
				// TODO Auto-generated method stub
				System.out.println("This is from Annymous");
			}
		};
		//c.showContent();
		
		Likable like = new Likable() {
			@Override
			public void like() {
				System.out.println("Like from Annonymous");
			}
		};
		//like.like();
		
		Person p = new Person();
		p.setLikable(new Likable() {
			@Override
			public void like() {
				System.out.println("Like from Annonymous");
			}
		});
		p.showLike();

	}
}

interface Likable {
	void like();
}

class Post {
	String content;

	void showContent() {
		System.out.println("This is Content");
	}
}

class Person {
	Likable likable;
	void setLikable(Likable likable){
		this.likable = likable;
	}
	
	void showLike(){
		// Code.......
		likable.like();
	}
}
