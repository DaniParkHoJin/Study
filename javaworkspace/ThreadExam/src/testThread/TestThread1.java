package testThread;

public class TestThread1 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyRunnable("First Thread"));
		Thread thread2 = new Thread(new MyRunnable("Second Thread"));
		
		thread1.start();
		thread2.start();
	}

}
