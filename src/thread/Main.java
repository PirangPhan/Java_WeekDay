package thread;

public class Main {
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
