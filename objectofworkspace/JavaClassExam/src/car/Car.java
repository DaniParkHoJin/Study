package car;

public class Car {

	// �ʵ�
	Tire tire1 = new HankookTire();
	Tire tire2 = new KumhoTire();

	// �޼ҵ�
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
