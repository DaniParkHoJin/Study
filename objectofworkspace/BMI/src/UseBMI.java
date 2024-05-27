
public class UseBMI {

	public static void main(String[] args) {
	
		BMI bmi1 = new BMI("홍길동", 18, 60, 1.75);
		System.out.println("이름 : " + bmi1.getName() + "\n 체질량 지수 : " + bmi1.getBMI() + "\n 체질량 상태 : " + bmi1.getSteatus());
	
		BMI bmi2 = new BMI("갑돌이", 100, 1.85);
		System.out.println("이름 : " + bmi1.getName() + "\n 체질량 지수 : " + bmi1.getBMI() + "\n 체질량 상태 : " + bmi1.getSteatus());
	
		}

}
