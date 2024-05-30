package market;

import java.util.Scanner;

public class WelcomeMarket {

	public static void main(String[] args) {
		// ��ĳ�� ��ü ����� ���� ��ĳ�� ��ü ����
		Scanner numberInput = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);

		// ���� ����
		int menuSelection; // �޴����� ����
		String userName; // �� �̸�
		String userTel; // �� ��ȭ��ȣ(11�ڸ� üũ �ʿ�)
		String userAddress; // �� �ּ�

		// ��ü ����
		User[] user = new User[1];// user��ü ������ ���� ����

		// �̸�, ��ȭ��ȣ�� �Է¹ް� ����.
		System.out.print("������ �̸��� �Է����ּ��� : ");
		userName = stringInput.nextLine();

		System.out.print("������ �޴��� ��ȣ(11�ڸ�)�� �Է����ּ��� : ");
		do {
			userTel = stringInput.nextLine();
			if (userTel.length() == 11) {
				break;
			} else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �޴��� ��ȣ(11�ڸ�)�� �Է����ּ��� : ");
			}

		} while (true);

		System.out.print("������ �ּҸ� �Է����ּ��� : ");
		userAddress = stringInput.nextLine();

		user[0] = new User(userName, userTel, userAddress, 0);// ��ü �迭 ���� 0�� �Ϲ��� 1�� �����ϸ� �����ڰ� �ȴ�.

		do {// do while�� ���� �ݺ��Ѵ�. 

			menuIntroduction();

			System.out.print(userName + "���� �޴�(��ȣ)�� �������ּ��� : ");
			menuSelection = numberInput.nextInt();
			System.out.println(menuSelection + "���� �����ϼ̽��ϴ�.");

			if (menuSelection < 1 || menuSelection >= 8) {
				break;

			} else {
				switch (menuSelection) {
				case 1:
					// ������ Ȯ��
					menuGuestInfo(userName, userTel, userAddress);
					break;
				case 2:
					// ��ٱ��� ��ǰ ��� ����
					menuCartItem();
					break;
				case 3:
					menuCartClear();
					// ��ٱ��� ����
					break;
				case 4:
					munuCartAdd();
					// ��ٱ��� �׸� �߰��ϱ�
					break;
				case 5:
					menuCartRemoveItemCount();
					// ��ٱ����� �׸� ���� ���̱�
					break;
				case 6:
					menuCartRemoveItem();
					// ��ٱ����� �׸� �����ϱ�
					break;
				case 7:
					menuCarBill();
					// ������ ǥ���ϱ�
					break;
				case 8:
					// ����
					break;
				default:
					// �̿��� ��ȣ�� ����
					break;
				}
				// break;// ������ �ݺ��� Ż��
			}

		} while (true);

	}

	private static void menuIntroduction() {

		System.out.println("-------------------------------------------");
		System.out.println("KOSMO BookMarket�� ���� ���� ȯ���մϴ�.");
		System.out.println("-------------------------------------------");
		System.out.println("1. ������ Ȯ�� \t\t4. ��ٱ��Ͽ� �׸� �߰��ϱ�");
		System.out.println("2. ��ٱ��� ��ǰ ��� ���� \t5. ��ٱ����� �׸� ���� ���̱�");
		System.out.println("3. ��ٱ��� ���� \t\t6. ��ٱ����� �׸� �����ϱ�");
		System.out.println();
		System.out.println("7. ������ ǥ���ϱ� \n8. ����");
		System.out.println("------------------------");
		System.out.println();

	}

	public static void menuGuestInfo(String userName, String userTel, String userAddress) {
		System.out.println("1. ������ Ȯ��");
		System.out.println("���� : " + userName + "\n�޴��� ��ȣ : " + userTel + "\n�ּ� : " + userAddress);
	}

	public static void menuCartItem() {
		System.out.println("2. ��ٱ��� ��ǰ ���");
	}

	public static void menuCartClear() {
		System.out.println("3. ��ٱ��� ����");
	}

	public static void munuCartAdd() {
		System.out.println("4.��ٱ��Ͽ� �׸� �߰��ϱ�");
	}

	public static void menuCartRemoveItemCount() {
		System.out.println("5. ��ٱ����� �׸� ���� ���̱�");
	}

	public static void menuCartRemoveItem() {
		System.out.println("6. ��ٱ����� �׸� �����ϱ�");
	}

	public static void menuCarBill() {
		System.out.println("7. ������ ǥ���ϱ�");
	}
}
