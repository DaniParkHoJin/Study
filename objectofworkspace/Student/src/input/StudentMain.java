package input;

import java.util.Scanner;

public class StudentMain {
	// ���� �ȿ��� ����ϱ� ���� static ���� ��ĳ�� ��ü ����
	static Scanner input = new Scanner(System.in);
	static Student[] info; // �л� ���� ��ü �迭
	static int studentCount; // �л���
	static boolean isAdded; // �Է� �ڷ� �߰� Ȯ��

	public static void main(String[] args) {
		int choice; // �޴� ���� ��ȣ
		Student inputData; // �Է� �ڷ�
		int inputLimit; // �Է� ����
		inputLimit = 0;
		isAdded = false; // �Է� �ڷ� �߰� Ȯ��(���� : false)
		do {
			System.out.print("�л� �ο��� �Է�(2~30) : ");
			studentCount = input.nextInt();
		} while (studentCount > 2 && studentCount <= 30);
		info = new Student[studentCount]; // �л� ��ü ����
		// �л� ��ü ����
		for (int i = 0; i < info.length; i++) {
			info[i] = new Student();
		}
		do {
			showMenu();
			choice = input.nextInt();
			input.nextLine(); // ���ڿ��� ���� �Է��� �������� �Ǵ� ���� ����
			switch (choice) {
			case 1:
				if (inputLimit < studentCount) {
					inputData = inputStudentInfo(); // �Է��� �л� ����
					info[inputLimit] = inputData; // �Է��� �л� ������ �߰�
					System.out.println(info[inputLimit].toString());
					if (isAdded == true) {
						++inputLimit;
						System.out.println(inputLimit + "��° �л� �������Է��� �Ϸ�Ǿ����ϴ�. \n");
					} else {
						System.out.println("�����Ͱ� ������� �ʾҽ��ϴ�.. \n");
					}
					break;
				} else {
					System.out.println("�Է��� �л����� �ʰ� �߽��ϴ�.");
					break;
				}
			case 2:

				searchData(); // �л� �˻�
				break;
			case 3:
				deleteData(); // �л� ����
				break;
			case 4:
				System.out.println("�л� ��ü ���");
				for (Student outData : info) {
					System.out.println(outData);
				}
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��Ͽ� ���α׷��� �����մϴ�.");
				return;
			}
		} while (true);
	}

	// �޴�
	public static void showMenu() {
		System.out.println("�л� ���� ��� ���α׷�");
		System.out.println("�����ϼ���...");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� �̸����� �˻�");
		System.out.println("3. �л� �̸����� ����");
		System.out.println("4. ��ü �л� ���");
		System.out.println("5. ���α׷� ����");
		System.out.print("����: ");
	}

	// �л����� �Է�
	public static Student inputStudentInfo() {
		String name; // �̸�
		String addr; // �ּ�
		String tel; // ��ȭ
		String grade; // �г�
		Student student; // �л� ��ü ����
		System.out.print("�̸� : ");
		name = input.nextLine();
		System.out.print("�ּ� : ");
		addr = input.nextLine();
		System.out.print("��ȭ��ȣ : ");
		tel = input.nextLine();
		System.out.print("�г� : ");
		grade = input.nextLine();
		student = new Student(name, addr, tel, grade);
		if (student != null) {
			isAdded = true;
			return student;
		}
		return null;
	}

	// �л� �˻� ����
	public static void searchData() {
		String searchName; // �˻��� �̸�
		Student info; // �˻��� �л� ����
		System.out.println("������ �˻��� �����մϴ�.");
		System.out.print("�л� �̸� : ");
		searchName = input.nextLine();
		// �л� �̸����� �˻�
		info = search(searchName);
		if (info == null) {
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		} else {
			System.out.println("�˻��� �л� ����");
			info.showStudentInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�. \n");
		}
	}

	// �л� �̸����� �˻�
	public static Student search(String name) {
		// �л� ����� ��ҿ� ���� �л���ü(����)�� �˻�.
		for (int i = 0; i < studentCount; i++) {
			if (info[i].getName().equals(name)) {
				return info[i];
			}
		}
		return null;
	}

	// �л��̸����� ����
	public static void deleteData() {
		String deleteName; // ������ �̸�
		System.out.println("������ ������ �����մϴ�..");
		System.out.print("�л� �̸� : ");
		deleteName = input.nextLine();
		// �л� ����� ��ҿ� ���� �л���ü(����)�� ������ ������ ��ȯ.
		for (int i = 0; i < studentCount; i++) {
			if (info[i].getName().equals(deleteName)) {
				info[i] = null;
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�. \n");
				return;
			}
		}
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
	}

}
