package exception;

public class Main {
	
	static int[] score = {100, 168, 999};

	public static void main(String[] args) {
		
		
		try{
			for (int i = 0; i <= 3; i++) {
				System.out.println(score[i]);
			}			
			
		}/*catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e){
			System.out.println("Wrong Index");
		}*//*catch (NullPointerException e1){
			// Code...
		}*/catch(Exception e3){
			if (e3 instanceof ArrayIndexOutOfBoundsException){
				System.out.println("IndexOutOfBound");
			} else {
				System.out.println("Unknown");
			}
		}
		finally{
			System.out.println("Finally");
		}
		
		
		try{
			for (int i = 0; i <= 3; i++) {
				System.out.println(score[i]);
			}						
		}catch (ArrayIndexOutOfBoundsException | NullPointerException e){
			// Code...
		}catch (ArithmeticException e1){
			// Code...
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}
	
	static void throwMsg() throws ArrayIndexOutOfBoundsException{
		for (int i = 0; i <= 3; i++) {			
			System.out.println(score[i]);
		}	
	}
	
	static void customThrowExp() {
		for (int i = 0; i <= 3; i++) {
			if (i==3){
				throw new NullPointerException();
			}
			System.out.println(score[i]);
		}	
	}

}
