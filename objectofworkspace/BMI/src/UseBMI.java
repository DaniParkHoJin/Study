
public class UseBMI {

	public static void main(String[] args) {
	
		BMI bmi1 = new BMI("ȫ�浿", 18, 60, 1.75);
		System.out.println("�̸� : " + bmi1.getName() + "\n ü���� ���� : " + bmi1.getBMI() + "\n ü���� ���� : " + bmi1.getSteatus());
	
		BMI bmi2 = new BMI("������", 100, 1.85);
		System.out.println("�̸� : " + bmi1.getName() + "\n ü���� ���� : " + bmi1.getBMI() + "\n ü���� ���� : " + bmi1.getSteatus());
	
		}

}
