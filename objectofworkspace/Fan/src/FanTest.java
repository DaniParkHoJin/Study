import java.util.Scanner;

public class FanTest {

	public static void main(String[] args) {
		// 1. �Է¹ޱ� ���� ��ĳ�� ��ü ����
		Scanner stringInput = new Scanner(System.in); // ���ڸ� �Է¹ޱ� ���� ��ĳ�� ��ü
		Scanner numberInput = new Scanner(System.in); // ���ڸ� �Է¹ޱ� ���� ��ĳ�� ��ü
		// 2. ���α׷� �̸� ��� ��������
		System.out.println("��ǳ�� ���� ��� ���α׷�");
		System.out.println();

		System.out.print("�� ���� ��ǳ�⸦ ������ �ֽ��ϱ�? ");
		int number; // ��ǳ�� ����� �޴� ����
		number = numberInput.nextInt();
		// �Է¹޴� ����� �ݺ�
		for (int i = 0; i < number; i++) {
			// 3. ��ü ����
			Fan myFan = new Fan();
			// 4. ����ӵ��� �Է¹޴´�
			System.out.print((i+1) + "��° ��ǳ�� �ܼ��� 1(����), 2(�߼�),3(���) �߿� �Է��ϼ��� : ");
			int nowFanSpeed;// ���� �ӵ��� �Է¹ޱ� ���� ���� ����
			nowFanSpeed = numberInput.nextInt();
			switch (nowFanSpeed) {
			case 1:
				myFan.setSpeed(Speed.SLOW);
				break;
			case 2:
				myFan.setSpeed(Speed.MEDIUM);
				break;
			case 3:
				myFan.setSpeed(Speed.FAST);
			default:
				break;
			}
			// 5. ���ۿ��θ� �Է¹޴´�.
			System.out.print("���� ��ǳ�Ⱑ ���� ���̸� '1'�� �������¸� '0'�� �Է��ϼ��� : ");
			int fanOn; // ���ۻ��¸� �ޱ� ���� ���� ����
			fanOn = numberInput.nextInt();

			if (fanOn == 1) {
				myFan.setOn(true);
			} else {
				myFan.setOn(false);
			}
			// 6. ������ �Է¹޴´�.
			System.out.print((i+1) + "��° ��ǳ���� ������ �Է��ϼ��� : ");
			myFan.setRadius(numberInput.nextInt());

			// 7. ������ �Է¹޴´�.
			System.out.print((i+1) + "��° ��ǳ���� ������ �Է��ϼ��� : ");
			myFan.setColor(stringInput.nextLine());

			// 8. ����Ѵ�.
			System.out.println(myFan.toString());
		}

		// 9. ��ĳ�� ��ü�� �ݴ´�.
		stringInput.close();
		numberInput.close();
	}

}
