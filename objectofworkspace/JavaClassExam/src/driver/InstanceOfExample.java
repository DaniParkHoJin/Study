package driver;

public class InstanceOfExample {

	public static void main(String[] args) {
		
		// ���� ��ü ����
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		// ride()�޼ҵ� ȣ�� �� ���� ��ü�� �Ű������� ����
//		ride(taxi);
		System.out.println();
//		ride(bus);
	}

	public static void ride(Vehicle vehicle) {
		if (vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		vehicle.run();
	}

}
