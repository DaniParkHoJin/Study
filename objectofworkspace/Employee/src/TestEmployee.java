import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {

		// 1. �Է¹ޱ� ���� ��ĳ�� ��ü ����
		Scanner scanner = new Scanner(System.in);
		// 2. ���α׷� �̸� ���
		System.out.println("---------- �Ｚ ���� ���� �Է� ���α׷� ----------");
		// 3. Employee ��ü ����
		Employee samsungNewEmployee = new Employee();
		// 4. set���� ������ �Է��Ѵ�.
		// 4.1. setName�� �̸��� �Է��Ѵ�.
		System.out.print("���� ������ �̸��� �Է��ϼ��� : ");
		samsungNewEmployee.setName(scanner.nextLine());
		// 4.2. setTel�� ��ȭ��ȣ�� �Է¹޴´�.
		System.out.print(samsungNewEmployee.getName() + "�� �޴��� ��ȣ�� - ���� �Է��ϼ��� : ");
		do {
			String inputTelNumber; // �޴��� ��ȣ�� �ӽ÷� ���� ����
			inputTelNumber = scanner.nextLine();
			// �޴��� ��ȣ �ڸ� �� ����
			if (inputTelNumber.length() == 11) {
				samsungNewEmployee.setTel(inputTelNumber);
				break; // 11�ڸ��� ������ do, while�� Ż��
			} else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. " + samsungNewEmployee.getName() + "�� �޴��� ��ȣ�� -���� �Է��ϼ��� : ");
			}
		} while (true);

		// 4.3. setSal�� ������ ���� ������ �Է¹޴´�.
		System.out.print(samsungNewEmployee.getName() + "�� ������ ���� ������ �Է��ϼ��� : ");

		do {
			int inputSal;
			inputSal = scanner.nextInt();

			if (inputSal > 0) {
				samsungNewEmployee.setSal(inputSal);
				break;
			} else {
				System.out
						.print("�߸��� ������ �Է��ϼ̽��ϴ�. ������ ���� ������ 1���������Դϴ�." + samsungNewEmployee.getName() + "�� ������ �Է��ϼ���.");
			}

		} while (true);

		// 5. �Էµ� ������ �پ��ϰ� ����Ѵ�.
		// 5.1. ��ü ���� �ż��带 �̿��� ���.
		samsungNewEmployee.printEmployee();
		// 5.2. main���� ��ü �ʵ庰 ���� getter�� �޾ƿ� ����ϴ� ���.
		System.out.println(samsungNewEmployee.getName() + "�� ��ȭ��ȣ�� " + samsungNewEmployee.getTel() + "�̰�, ������ "
				+ samsungNewEmployee.getSal() + "�����Դϴ�.");

		// 6. ��ĳ�� ��ü ����.
		scanner.close();
	}

}
