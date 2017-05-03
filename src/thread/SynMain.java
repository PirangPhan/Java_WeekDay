package thread;

public class SynMain {
	
	public static void main(String[] args) {
		new SynMain().process();
		
	}
	
	int count = 0;
	
	synchronized void increment(){
		count++;
	}
	
	void process(){
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {				
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
