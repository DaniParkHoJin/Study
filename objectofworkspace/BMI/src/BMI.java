
public class BMI {
	
	private String name; // �̸�
	private int age;		// ����
	private double weight;	// ������
	private double height;	// Ű

	// �⺻ ������
	public BMI() {
		super();
	}

	 // �̸� ���� ������ Ű�� �޴� ������
	public BMI(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	// �̸� ������ Ű�� �޴� ������
	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}

	// BMI ��� 
	public double getBMI() {
		// �����Ը� Ű�� �ι� ���� ������ ����.
		double bmi = weight / (height * height);
		return Math.round(bmi * 100) / 100.0;
	}

	// BMT ���� ������ �Ǻ�
	public String getSteatus() {
		double bmi = getBMI();
		if (bmi < 16) {
			return "����� �ɰ��� ��ü��";
		}  else if (bmi < 18) {
			return "����� ��ü��";
		} else if (bmi < 24) {
			return "����� ���� ü��";
		} else if (bmi < 29) {
			return "����� ��ü��";
		} else if (bmi < 35){
			return "����� �ɰ��� ��ü��(�� ��";
		} else  {
			return "����� ������ ��ü��(�� �� ��)";
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
