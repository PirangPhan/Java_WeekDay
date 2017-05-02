package nestedclass;

import java.util.ArrayList;

public class User {
	int id;
	String name;
	ArrayList<Article> articlesList;
	
	void showUser(){
		User.Article.Category c = new User.Article.Category();
		c.showCategory();
	}

	static class Article {
		int id;
		String title;
		Category category;
		
		static class Category{
			int id;
			String title;
			
			void showCategory(){
				
			}
		}
	}

}
