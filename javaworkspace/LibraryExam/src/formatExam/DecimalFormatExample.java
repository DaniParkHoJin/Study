package formatExam;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat decimalFormat;
		
		// ���� �ڸ����� ǥ��
		decimalFormat = new DecimalFormat("#,###");
		System.out.println(decimalFormat.format(num));
		
		// ������ �Ҽ� ù° �ڸ����� ǥ��
		decimalFormat = new DecimalFormat("#,###.0");
		System.out.println(decimalFormat.format(num));
	}

}
