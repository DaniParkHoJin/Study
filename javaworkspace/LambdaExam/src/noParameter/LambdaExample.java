package noParameter;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();

		// �ǻ����� �� �� �̻��� ��� �߰�ȣ �ʿ�
		person.action(() -> {
			System.out.println("����� �մϴ�.");
			System.out.println("���α׷����� �մϴ�.");
		});
		
		// ���๮�� �� ���� ��� �߰�ȣ ���� ����
		person.action(()->System.out.println("��� �մϴ�."));
	}

}
