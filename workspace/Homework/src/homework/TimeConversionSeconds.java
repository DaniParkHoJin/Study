package homework;

import java.util.Scanner;

public class TimeConversionSeconds {

	public static void main(String[] args) {

		// �Է� �ޱ� ���� ��ĳ�� ��ü ����
		Scanner input = new Scanner(System.in);

		// �ʿ��� ���� ����
		int hour; // �ð��� �Է¹��� ����
		int minute; // ���� �Է¹��� ����
		int second; // �ʸ� �Է¹��� ����
		int sum; // �������� �� ����

		// ���α׷� ���� ����Ѵ�.
		System.out.println("�ð�(��, ��, ��)�� �ʷ� ȯ���ϴ� ���α׷�");

		// ����ڷκ��� �ø� �Է¹޴´�.
		System.out.print("�ø� �Է��ϼ���. : ");
		hour = input.nextInt();

		// �Է¹��� �ø� �ʷ� ȯ���ϰ� �������Ѵ�.
		// �ð� * 60(��) * 60(��)
		sum = hour * 60 * 60;

		// ����ڷκ��� ���� �Է¹޴´�.
		System.out.print("�и� �Է��ϼ���. : ");
		minute = input.nextInt();

		// �Է¹��� ���� �ʷ� ȯ���Ѱ� �������Ѵ�.
		// �� * 60(��)
		sum += minute * 60;

		// ����ڷκ��� �ʸ� �Է¹޴´�.
		System.out.print("�ʸ� �Է��ϼ���. : ");
		second = input.nextInt();
		
		// �Է¹��� �ʸ� ������ �Ѵ�.
		sum += second;
		
		// ������ �ʸ� ����Ѵ�.
		System.out.println(hour + "�ð� " + minute + "�� " + second + "�ʴ� " + sum + "���̴�.");
		
		input.close();		
	}

}
