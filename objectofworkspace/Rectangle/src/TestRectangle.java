import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		// scanner ��ü ����
		Scanner scanner = new Scanner(System.in);

		// Rectangle ��ü �ν��Ͻ�ȭ
		Rectangle whiteBoard = new Rectangle();

		// ���α׷� �̸� ��������
		System.out.println("ȭ��Ʈ ���� ���� ��� ���α׷�");

		// ���� ���̸� �Է¹޴´�.
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		whiteBoard.setWidth(scanner.nextInt());

		// ���� ���̸� �Է¹޴´�.
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		whiteBoard.setLength(scanner.nextInt());

		// rec1 ��ü�� calcArea�� �ҷ� ����Ѵ�.
		// calArea()�� �̿��� ���
		System.out.println("�Է��Ͻ� ȭ��Ʈ ������ ���̴� : " + whiteBoard.calcArea() + "�Դϴ�.");
		// calArea(int width, int length)�� �̿��� ���
		System.out.println(
				"�Է��Ͻ� ȭ��Ʈ ������ ���̴� : " + whiteBoard.calcArea(whiteBoard.getWidth(), whiteBoard.getLength()) + "�Դϴ�.");

		// ��¹� �ȿ��� ���
		System.out.println("�Է��Ͻ� ȭ��Ʈ ������ ���̴� : " + whiteBoard.getWidth() * whiteBoard.getLength() + "�Դϴ�.");

		scanner.close();

	}

}
