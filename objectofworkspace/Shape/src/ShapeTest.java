import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// 1. ��ǥ�� �Է¹޴� ��ĳ�� ��ü ����
		Scanner pointInput = new Scanner(System.in);

		// 2. ���α׷� ��������
		System.out.println("��ǥ�� �Է¹޾� ������ �׸��� ���α׷�");
		System.out.println();
		
		// 3. ��ǥ�� �Է¹޴� point ��ü ����
		Point point = new Point();

		// 4. x ��ǥ�� �Է¹޴´�.
		System.out.print("x ��ǥ�� �Է��ϼ��� : ");
		point.setPointX(pointInput.nextDouble());

		// 5. y ��ǥ�� �Է¹޴´�.
		System.out.print("y ��ǥ�� �Է��ϼ��� : ");
		point.setPointY(pointInput.nextDouble());
		
		
	}

}
