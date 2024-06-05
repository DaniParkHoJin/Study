package testThread;

public class MyRunnable implements Runnable {
	String myName;

	public MyRunnable(String myName) {
		super();
		this.myName = myName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(myName + i);
		}
	}

}