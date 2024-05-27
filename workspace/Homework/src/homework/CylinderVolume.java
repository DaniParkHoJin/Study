package homework;

import java.util.Scanner;

public class CylinderVolume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double radius; 	// ������
		double length; 	// ����
		double area;	// ���� ����
		double volume; 	// �Ǹ����� ����

		// ����ڷκ��� �Ǹ����� �������� �Է¹޴´�.
		System.out.print("�Ǹ����� �������� �Է��ϼ��� : ");
		radius = input.nextDouble();

		// ����ڷκ��� �Ǹ����� ���̸� �Էƹ޴´�.
		System.out.print("�Ǹ����� ���̸� �Է��ϼ��� : ");
		length = input.nextDouble();

		// �Է¹޴� �������� ���̰� 0 ���ϸ� ����� �� ����.
		if (radius > 0 && length > 0) {

			// �Է¹��� ���������� ���� ������ ���Ѵ�.
			// ���� ���� = ������ * ������ * ������
			area = radius * radius * 3.14;

			// ������ ���� �������� �Է¹��� ���̷� �Ǹ����� ���Ǹ� ���Ѵ�.
			volume = area * length;

			// ����� ���Ǹ� ����Ѵ�.
			System.out.println("�Ǹ����� ���Ǵ� " + volume + "�Դϴ�.");

		} else {
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
		}
		input.close();
	}

}
