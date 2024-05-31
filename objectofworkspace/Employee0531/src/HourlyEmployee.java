
public class HourlyEmployee extends Employee {
	// 필드
	private double hourlyWage;// 시급
	private double workTime;// 노동 시간
	// 기본생성자

	public HourlyEmployee() {
		super();
	}

	// 필드를 모두 받는 생성자
	public HourlyEmployee(double hourlyWage, double workTime) {
		super();
		this.hourlyWage = hourlyWage;
		this.workTime = workTime;
	}

	// 부모 필드 + 자기 필드 생성자
	public HourlyEmployee(String name, int employeeNumber, double hourlyWage, double workTime) {
		super(name, employeeNumber);
		this.hourlyWage = hourlyWage;
		this.workTime = workTime;
	}

	// 접근자 시급
	public double getHourlyWage() {
		return hourlyWage;
	}

	// 접근자 노동 시간
	public double getWorkTime() {
		return workTime;
	}

	// 설정자 시급
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	// 설정자 시간
	public void setWorkTime(double workTime) {
		this.workTime = workTime;
	}

	// 메서드 재정의
	@Override
	public double computeSalary() {
		return this.hourlyWage * this.workTime;// 시급 * 노동 시간 = 임금
	}

	@Override
	public String toString() {
		return getName() + "님의 급여는 " + getHourlyWage() * getWorkTime() + "원 입니다.";
	}

}
