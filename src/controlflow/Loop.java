package controlflow;

public class Loop {
	public static void main(String[] args) {
		
		String[] score = {"A","B","C"};
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		// Foreach
		for (String string : score) {
			System.out.println(string);
		}
		
		
		
		
		
	}
}
