package car;

public class CarExample {

	public static void main(String[] args) {
		// Car ��ü ����
		Car car = new Car();

		// �͸� �ڽ� ��ü�� ���Ե� �ʵ� ���
		car.run1();

		// �͸� �ڽ� ��ü�� ���Ե� ���� ���� ���
		car.run2();

		// �͸� �ڽ� ��ü�� ���Ե� �ŰԺ��� ���
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("�͸� �ڽ� Tire ��ü 3�� �������ϴ�.");
			}
		});

	}

}
