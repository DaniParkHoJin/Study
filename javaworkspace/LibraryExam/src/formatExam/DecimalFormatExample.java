package formatExam;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat decimalFormat;
		
		// 정수 자리까지 표기
		decimalFormat = new DecimalFormat("#,###");
		System.out.println(decimalFormat.format(num));
		
		// 무조건 소수 첫째 자리가지 표기
		decimalFormat = new DecimalFormat("#,###.0");
		System.out.println(decimalFormat.format(num));
	}

}
