
public class BMI {
	
	private String name; // 이름
	private int age;		// 나이
	private double weight;	// 몸무게
	private double height;	// 키

	// 기본 생성자
	public BMI() {
		super();
	}

	 // 이름 나이 몸무게 키를 받는 생성자
	public BMI(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	// 이름 몸무게 키를 받는 생성자
	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}

	// BMI 계산 
	public double getBMI() {
		// 몸무게를 키를 두번 곱한 것으로 나눔.
		double bmi = weight / (height * height);
		return Math.round(bmi * 100) / 100.0;
	}

	// BMT 나온 값으로 판별
	public String getSteatus() {
		double bmi = getBMI();
		if (bmi < 16) {
			return "당신은 심각한 저체중";
		}  else if (bmi < 18) {
			return "당신은 저체중";
		} else if (bmi < 24) {
			return "당신은 정상 체중";
		} else if (bmi < 29) {
			return "당신은 과체중";
		} else if (bmi < 35){
			return "당신은 심각한 과체중(고도 비만";
		} else  {
			return "당신은 위험한 과체중(초 고도 비만)";
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
	
	

}
