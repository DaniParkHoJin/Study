package account;

import java.util.Scanner;

public class BankApplication {
	// �Է¹ޱ� ���� ��ĳ�� ��ü
	static Scanner StringInput = new Scanner(System.in);
	static Scanner numberInput = new Scanner(System.in);

	// �ʿ� ���� ����
	static Account[] info; // ���� ���� ��ü �迭
	static int accountCount; // ���¼�
	static boolean isAdded; // �Է� �ڷ� �߰� Ȯ��
	static int inputLimit; // �Է� ����
	static Account inputData; // �Է� �ڷ�

	public static void main(String[] args) {
		// �ʿ� ���� ����
		int choice; // �޴� ���� ����

		// ���� �ʱ�ȭ
		inputLimit = 0;
		isAdded = false;

		// ���� ���� �°� ��ü �迭 ����
		accountCount = 100;// �������� 100����

		info = new Account[accountCount]; // account ��ü 100�� ����

		// �л� ��ü ����
		for (int i = 0; i < info.length; i++) {
			info[i] = new Account();
		}
		do {
			showmenu();
			choice = numberInput.nextInt();
			numberInput.nextLine();// ���ڿ��� ���� �Է��� �������� �Ǵ� ���� ����

			switch (choice) {
			case 1:
				// ���� ����
				creatData();
				break;
			case 2:
				// ���� ���
				break;
			case 3:
				// ����
				break;
			case 4:
				// ���
				break;
			case 5:
				// ����
				System.out.println("���α׷� ����");
				return;
			default:
				//
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				break;
			}

		} while (true);

	}

	public static void creatData() {


			inputData = inputAccountInfo();

			++inputLimit;
			System.out.println("--------");
			System.out.println("���»���");
			System.out.println("--------");

	}

	public static Account inputAccountInfo() {
		String accountNumber; // ���¹�ȣ
		String name; // ������
		int balance; // �Աݾ�
		Account account; // ���� ��ü ����

		System.out.print("���¹�ȣ: ");
		accountNumber = StringInput.nextLine();
		System.out.print("������: ");
		name = StringInput.nextLine();
		System.out.print("�ʱ��Աݾ�: ");
		balance = numberInput.nextInt();
		System.out.println("���°� �����Ǿ����ϴ�.");

		account = new Account(accountNumber, name, balance);
		if (account != null) {
			isAdded = true;
			return account;
		}
		return null;
	}

	public static void showmenu() {

		System.out.println("-------------------------------------------");
		System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5. ����");
		System.out.println("-------------------------------------------");
		System.out.print("����> ");
	}

}
