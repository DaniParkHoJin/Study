package mathExam;

public class MathExample {

	public static void main(String[] args) {
		// ū ���� �Ǵ� ���� ���� ���
		double v1;
		double v2;
		
		v1 = Math.ceil(5.3);
		v2 = Math.floor(5.3);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		// ū �� �Ǵ� ���� �� ���
		long v3;
		long v4;
		v3 = Math.max(3, 7);
		v4 = Math.min(3, 4);
		System.out.println("v3 = " + v3);
		System.out.println("v3 = " + v4);
		
		// �Ҽ� ���� �� �ڸ� ���
		double value;
		double temp1;
		long temp2;
		double v5;
		
		value = 12.3456;
		temp1 = value * 100;
		temp2 = Math.round(temp1);
		v5 = temp2/100.0;
		System.out.println("v5 = " + v5);
		
	}

}
