import java.util.Scanner;

public class GreatestCommonDivisorMethod {

	public static void main(String[] args) {

		// 사용자로부터 입력을 받기위해 Scanner 객체를 생성한다.
		Scanner input = new Scanner(System.in);

		int firstNumber; // 첫번째정수
		int secondNumer; // 두번째정수

		System.out.println("두 개의 정부에서 최대 공약수를 찾는 프로그램");

		System.out.print("첫 번째 정수 입력 : ");
		firstNumber = input.nextInt();

		System.out.print("두 번째 정수 입력 : ");
		secondNumer = input.nextInt();

		System.out.println(firstNumber + " 와 " + secondNumer + "의 최대 공약수 : " + gcd(firstNumber, secondNumer));
	}

	public static int gcd(int firstNumber, int secondNumer) {
		int gcd = 1; // 최대 공약수
		int d = 2; // 공약수

		while ((d <= firstNumber) && (d <= secondNumer)) {
			if ((firstNumber % d == 0) && (secondNumer % d == 0)) {
				gcd = d;

			}
			d++;
		}
		return gcd;
	}

}
