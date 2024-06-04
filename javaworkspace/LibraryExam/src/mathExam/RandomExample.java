package mathExam;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 선택번호
		int[] selectNumber;
		selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("선택번호: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");

		}
		System.out.println();

		// 당첨번호
		int[] winnerNumber;
		winnerNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨번호: ");
		for (int i = 0; i < 6; i++) {
			winnerNumber[i] = random.nextInt(45) + 1;
			System.out.print(winnerNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winnerNumber);
		boolean result = Arrays.equals(selectNumber, winnerNumber);
		System.out.print("당첨여부: ");
		if (result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
