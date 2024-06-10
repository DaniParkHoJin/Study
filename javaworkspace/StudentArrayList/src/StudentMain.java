
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	// ���� �ȿ��� ����ϱ� ���� static ���� ��ĳ�� ��ü ����
	static Scanner input = new Scanner(System.in);
	static List<Student> infoStudent = new ArrayList<Student>();// �л� ���� ��ü

	public static void main(String[] args) {
		int choice; // �޴� ���� ��ȣ
		Student inputData; // �Է� �ڷ�
		boolean isAdded = false; // �Է� �ڷ� �߰� Ȯ��(���� : false)

		do {
			showMenu();
			choice = input.nextInt();
			input.nextLine(); // ���ڿ��� ���� �Է��� �������� �Ǵ� ���� ����
			switch (choice) {
			case 1:

				inputData = inputStudentInfo(); // �Է��� �л� ����
				isAdded = infoStudent.add(inputData); // �Է��� �л� ������ �߰�
				if (isAdded == true) {

					System.out.println("�������Է��� �Ϸ�Ǿ����ϴ�. \n");
				} else {
					System.out.println("�����Ͱ� ������� �ʾҽ��ϴ�.. \n");
				}
				break;

			case 2:

				searchData(); // �л� �˻�
				break;
			case 3:
				deleteData(); // �л� ����
				break;
			case 4:
				System.out.println("�л� ��ü ���");
				for (Student outData : infoStudent) {
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

		System.out.print("�̸� : ");
		name = input.nextLine();
		System.out.print("�ּ� : ");
		addr = input.nextLine();
		System.out.print("��ȭ��ȣ : ");
		tel = input.nextLine();
		System.out.print("�г� : ");
		grade = input.nextLine();
		return new Student(name, addr, tel, grade);

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
		// �л� ����� ��ҿ� ���� �ݺ���(�л���ü:����)�� ������ ������ ��ȯ.
		Iterator<Student> itr = infoStudent.iterator();

		while (itr.hasNext()) {
			Student curInfo = itr.next();// ���� �л� ��ü
			if (name.compareTo(curInfo.getName()) == 0) {
				return curInfo;
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
		Iterator<Student> itr = infoStudent.iterator();
		// �л� ����� ��ҿ� ���� �л���ü(����)�� ������ ������ ��ȯ.
		while (itr.hasNext()) {
			Student curInfo = itr.next();
			if (deleteName.compareTo(curInfo.getName()) == 0) {
				itr.remove();
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
				return;
			}

		}
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
	}

}
