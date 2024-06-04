package car;

public class Car {
	// �ʵ忡 Tire ��ü ����

	private Tire tire1 = new Tire();

	// �ʵ忡 �͸� �ڽ� ��ü ����
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("�͸� �ڽ� Tire ��ü 1�� �������ϴ�.");
			super.roll();
		}

	};

	// �޼ҵ�(�ʵ� �̿�)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}

	// �޼ҵ�(���� ���� �̿�)
	public void run2() {
		Tire tire = new Tire() {

			@Override
			public void roll() {
				System.out.println("�͸� �ڽ� Tire ��ü 2�� �������ϴ�.");
				super.roll();
			}
		};
		tire.roll();
	}
	// �޼ҵ�(�Ű����� �̿�)
	public void run3(Tire tire) {
		tire.roll();
	}

}
