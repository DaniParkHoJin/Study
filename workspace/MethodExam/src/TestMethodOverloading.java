
public class TestMethodOverloading {

	public static void main(String[] args) {
		System.out.println("3 과 4 중에 큰 정수는 " + max(3, 4) + "이다.");
		System.out.println("3.0 과 5.4 중에 큰 실수는 " + max(3.0, 5.4) + "이다.");
		System.out.println("3.0과 5.4 그리고 10.14 중에 큰 실수는 " + max(3.0, 5.4, 10.14) + "이다.");

	}

	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}

	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

}
