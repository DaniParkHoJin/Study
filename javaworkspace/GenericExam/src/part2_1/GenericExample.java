package part2_1;

public class GenericExample {

	public static void main(String[] args) {
		// k�� Tv�� ��ü, M�� String���� ��ü
		Product<Tv, String> product1 = new Product<>();

		// Setter �Ű����� �ݵ�� Tv�� String�� ����
		product1.setKind(new Tv());
		product1.setModel("����ƮTV");

		// Getter ���ϰ��� Tv�� String�� ��
		Tv tv = product1.getKind();
		String tvModel;
		tvModel = product1.getModel();

		// K�� Car�� ��ü, M�� String���� ��ü
		Product<Car, String> product2 = new Product<Car, String>();

		// Setter �Ű����� �ݵ�� Car�� String�� ����
		product2.setKind(new Car());
		product2.setModel("�׽��� ��S");

		// Getter ���ϰ��� Car�� String�� ��
		Car car = product2.getKind();
		String CarModel;
		CarModel = product2.getModel();
	
	}

}
