package threadExam;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
