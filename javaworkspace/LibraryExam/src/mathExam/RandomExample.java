package mathExam;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// ���ù�ȣ
		int[] selectNumber;
		selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("���ù�ȣ: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");

		}
		System.out.println();

		// ��÷��ȣ
		int[] winnerNumber;
		winnerNumber = new int[6];
		random = new Random(5);
		System.out.print("��÷��ȣ: ");
		for (int i = 0; i < 6; i++) {
			winnerNumber[i] = random.nextInt(45) + 1;
			System.out.print(winnerNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷����
		Arrays.sort(selectNumber);
		Arrays.sort(winnerNumber);
		boolean result = Arrays.equals(selectNumber, winnerNumber);
		System.out.print("��÷����: ");
		if (result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}

}
