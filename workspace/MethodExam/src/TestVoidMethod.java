import java.util.Scanner;

public class TestVoidMethod {

	public static void main(String[] args) {
		System.out.println("학점 : ");
		printGrade(65.2);

	}

	public static void printGrade(double score) {
		if (score < 0 || score > 100) {
			System.out.println("유효하지 않은 점수");
			return;
		}

		if (score >= 90) {
			System.out.println('A');
		} else if (score >= 80) {
			System.out.println('B');
		} else if (score >= 70) {
			System.out.println('C');
		} else if (score >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}

}
