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
			System.out.println("����� ������ �� �����ϴ�. ���� ��� : " + apple + "�������� ���� : " + value);
			notify();
			return 0;
		}
		apple -= value;
		System.out.println("���� ��� : " + apple);
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
	System.out.println("������� ���� : " + value + ", ���� ���� : " + (apple + value));
	apple += value;
	available = true;
	notify();
	}
	
}
