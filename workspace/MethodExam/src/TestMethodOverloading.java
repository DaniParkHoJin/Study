
public class TestMethodOverloading {

	public static void main(String[] args) {
		System.out.println("3 �� 4 �߿� ū ������ " + max(3, 4) + "�̴�.");
		System.out.println("3.0 �� 5.4 �߿� ū �Ǽ��� " + max(3.0, 5.4) + "�̴�.");
		System.out.println("3.0�� 5.4 �׸��� 10.14 �߿� ū �Ǽ��� " + max(3.0, 5.4, 10.14) + "�̴�.");

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
