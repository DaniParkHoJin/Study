import java.util.Scanner;

public class BoxTest {

	public static void main(String[] args) {
		// 1. �Է¹ޱ� ���� ��ĳ�� ��ü ����
		// 2. Box ��ü ����
		// 3. ���α׷� �̸� ��� ��������
		// 4. ���̸� �Է¹޴´�.
		// 5. �ʺ� �Է¹޴´�.
		// 6. ���� �Է¹޴´�.
		// 7. ����ִ��� ä���ִ��� �Է¹޴´�.
		// 8. ���α׷����� �߰� ���α׷��� �ִ´�.
		// 9. ���α׷� ���Ŀ� �°� ����Ѵ�.

		// 1. �Է¹ޱ� ���� ��ĳ�� ��ü ����
		Scanner scanner = new Scanner(System.in);

		// 2. Box ��ü ����
		Box swimmingPool = new Box();

		// 3. ���α׷� �̸��� ����Ѵ�.
		System.out.println("---------- �����忡 ����ִ� ���� ���� ���ϴ� ���α׷� ----------");
		System.out.println();


		// 4. �ʺ�(����)�� �Է¹޴´�.
		System.out.print("�������� ���α��̸� �Է��ϼ��� : ");
		swimmingPool.setWidth(scanner.nextDouble());

		// 5. ��(����)�� �Է¹޴´�.
		System.out.print("�������� ���α��̸� �Է��ϼ��� : ");
		swimmingPool.setHeadth(scanner.nextDouble());

		// 6. ����(����)�� �Է¹޴´�.
		System.out.print("�������� ���̸� �Է��ϼ��� : ");
		swimmingPool.setHeight(scanner.nextDouble());
		
		// 7. ����ִ��� ä���ִ��� �Է¹޴´�.
		System.out.print("�������� ��������� 0, ä���� ������ 1�� �Է��ϼ��� : ");
		
		int empty; // ���� ������ �ޱ� ���� ����
		
		empty = scanner.nextInt();
		
		if (empty == 1) {
			swimmingPool.setEmpty(true);
		} else {
			swimmingPool.setEmpty(false);
		}
		// 8. ���α׷����� �߰� ���α׷��� �ִ´�
		double volumePool; // ���Ǹ� �ֱ� ���� ����
		double waterAmount;	// ���� ���� �ֱ� ���� ����
		
		volumePool = swimmingPool.getWidth() * swimmingPool.getHeadth() * swimmingPool.getHeight();
		waterAmount = swimmingPool.getWidth() * swimmingPool.getHeadth() * swimmingPool.getHeight() * empty;
		// �⺻ ���� ���Ŀ� ���¿� ���� ���� ���� ����Ѵ�.
		
		
		// 9. ���α׷� ���Ŀ� �°� ����Ѵ�.
		System.out.println("����� �������� ���� " + swimmingPool.getWidth() + "M �̰�, ���� " + swimmingPool.getHeight() + "M �̸�, ���� " + swimmingPool.getHeight() + "M �Դϴ�.");
		System.out.println("�׸��� ����� ������ ���� " + waterAmount + "L �Դϴ�.");
		System.out.println(swimmingPool.toString());
		
		// 10. scanner �ݱ�
		scanner.close();
		
	}

}
