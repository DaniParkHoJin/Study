package homework;

import java.util.Scanner;

public class CreditCardExpenses {

	public static void main(String[] args) {

		// 1. �Է� �ޱ� ���� ��ĳ�� ��ü ����
		Scanner scanner = new Scanner(System.in);

		// 2. ���� ����
		int sum; // 12���� �ѻ�� �ݾ�
		int avg; // �� ��� ��� �ݾ�
		int max; // ���� ���� ����� �ݾ�
		int min; // ���� ���� ����� �ݾ�
		int month; // ���� ���� ����
		
		month = 0;
		sum = 0;
		avg = 0;

		// 3. �迭 ����
		int[] CardExpenses = new int[12];

		// ���α׷� ����
		System.out.println("ī�� ��� �ݾ�");

		// 4. 12����ġ ī����ݾ��� �Է� �޴� �ݺ���
		// ī����ݾ��� �Է¹޴� �ͺ��� �ۼ� �� 12�� �ݺ�
		// 4.1. ī����ݾ��� �Է� ���� �� ������ �˻��Ѵ�.
		// 4.2. �ݺ��� �ȿ��� ī����ݾ� ������ ���Ѵ�.
		for (int i = 0; i < CardExpenses.length; i++) {
			do {
				System.out.print((i + 1) + "�� ��� �ݾ��� �Է��ϼ���. : ");
				CardExpenses[i] = scanner.nextInt();
				if (CardExpenses[i] < 0) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. ��Ȯ�� ���ݾ��� �Է��ϼ���. : ");
				}
			} while (CardExpenses[i] < 0);

			sum += CardExpenses[i];
		}
		// 5. ���տ��� ����� ���Ѵ�.
		avg = sum / CardExpenses.length;
		// 6. 1�� ���� ��ü ���ݾ��� ����Ѵ�.
		System.out.println("1�� ������ ��ü ���ݾ� : " + sum);

		// 7. �� ��� ��� �ݾ��� ����Ѵ�.
		System.out.println("�� ��� ��� �ݾ� : " + avg);

		// 8. ���� ī�带 ���� ����� ���� ã�´�.
		// �ݺ������� �ִ밪�� ã�´�.
		max = CardExpenses[0];
		for (int i = 0; i < CardExpenses.length; i++) {
			if (max < CardExpenses[i]) {
				max = CardExpenses[i];
				month = i + 1;

			}
		}
		System.out.println("���� ������ ���Ҵ� �� : " + month);

		// 9. ���� ī�带 ���� ����� ���� ã�´�.
		// �ݺ������� �ּҰ��� ã�´�.
		month = 1;
		min = CardExpenses[0];
		for (int i = 0; i < CardExpenses.length; i++) {
			if (min > CardExpenses[i]) {
				min = CardExpenses[i];
				month = i + 1;
			}

		}
		System.out.println("���� ������ ������ �� : " + month);

		// 10. ���� ������ ���Ҵ� ���� ����Ѵ�.
		/*
		 * // 11. ���� ������ ������ ���� ����Ѵ�.
		 */
		scanner.close();
	}

}
