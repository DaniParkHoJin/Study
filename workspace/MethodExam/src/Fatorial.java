import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number;

		System.out.print("팩토리얼 계산 정수를 입력하세요 : ");
		number = input.nextInt();

		if (number < 0) {
			System.out.println("음수를 사용할 수 없습니다.");
			System.exit(1);
		}
		long value = fatorial(number);
		System.out.println(number + "! = " + value);
	}

	private static long fatorial(int n) {
		if (n > 0) {
			return n * fatorial(n - 1);
		} else {
			return 1;
		}

	}

}
