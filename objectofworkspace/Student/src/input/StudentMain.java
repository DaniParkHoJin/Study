package input;

import java.util.Scanner;

public class StudentMain {
	// ���� �ȿ��� ����ϱ� ���� static ���� ��ĳ�� ��ü ����
	static Scanner input = new Scanner(System.in);
	static Student[] info; // �л� ���� ��ü �迭
	static int studentCount; // �л� ��
	static boolean isAdded; // �Է� �ڷ� �߰� Ȯ��

	public static void main(String[] args) {

		// ���� ����
		int choice; // �޴� ���� ��ȣ
		Student inputData; // �Է� �ڷ�
		int inputLimit;// �Է� ����

		inputLimit = 0;
		isAdded = false; // �Է� �ڷ� �߰� Ȯ��(���� : false)

		switch (choice) {
		case 1:
			// �Է��� �л� ����
			// �Է��� �л� ������ �߰�
			break;

		case 2:
			// �л� �˻�
			break;
		
		case 3:
			// �л� ����
			break;

		case 4:
			// ��ü ��� ���
			System.out.println("�л� ��ü ���");
			break;
			
		case 5:
			// ���α׷� ����
			System.out.println("���α׷��� �����մϴ�.");
			return;
			
		default:
			System.out.println("�߸� �Է��Ͽ� ���α׷��� �����մϴ�.");
			break;
		}

	}

	// �޴�
	public static void showMeun() {
		System.out.println("�л� ���� ��� ���α׷�");
		System.out.println("�����ϼ���...");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� �̸����� �˻�");
		System.out.println("3. �л� �̸����� ����");
		System.out.println("4. ��ü �л� ���");
		System.out.println("5. ���α׷� ����");
		System.out.print("����:");
	}

}
