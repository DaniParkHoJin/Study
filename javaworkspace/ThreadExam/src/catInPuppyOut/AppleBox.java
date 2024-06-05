package catInPuppyOut;

public class AppleBox {
	static private int apple = 10;
	private boolean available = false;

	public synchronized int get(int value) {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
		available = false;
		
		if (apple-value < 0) {
			System.out.println("사과를 가져갈 수 없습니다. 현재 사과 : " + apple + "가지려는 수량 : " + value);
			notify();
			return 0;
		}
		apple -= value;
		System.out.println("현재 사과 : " + apple);
		notify();
		return value;
	}
	public synchronized void save(int value) {
	while (available == true) {
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	System.out.println("사과담을 수량 : " + value + ", 현재 수량 : " + (apple + value));
	apple += value;
	available = true;
	notify();
	}
	
}
