import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// 스캐너 객체 생성 String, Number
		Scanner stringInput = new Scanner(System.in);
		Scanner numberInput = new Scanner(System.in);
		// 변수 선언
		// 필요 변수 : 이름, 사번, 월급, 시급, 노동 시간
		String name;// 이름
		int employeeNumber;// 사번
		double salary; // 월급
		double hourlyWage;// 시급
		double workTime; // 노동 시간

		// 입력받기
		System.out.println("임금 계산 프로그램");
		System.out.println();

		// 월급과 시급을 판별필요, 그에 따른 객체 분류가 필요
		System.out.print("당신은 정규직입니까? 정규직이면 1, 아니면 다른 번호를 눌러주세요. : ");
		// 판별을 위한 변수 선언

		if (numberInput.nextInt() == 1) {
			// 정규직 이므로 정규직 객체를 생성
			SalariedEmployee salariedEmployee = new SalariedEmployee();
			// 이름 입력
			System.out.print("이름을 입력하세요 : ");
			name = stringInput.nextLine();
			salariedEmployee.setName(name);
			// 사원번호 입력, 음수를 넣지 못하게 판별식도 넣을 수 있다.
			System.out.print("사원 번호를 입력하세요 : ");
			employeeNumber = numberInput.nextInt();
			salariedEmployee.setEmployeeNumber(employeeNumber);
			// 월급 입력, 음수를 넣지 못하게 판별식도 넣을 수 있다.
			System.out.print("월급을 입력하세요 : ");
			salary = numberInput.nextDouble();
			salariedEmployee.setSalary(salary);

			System.out.println(salariedEmployee.computeSalary());

		} else {
			// 나머지 번호는 모두 시급으로 계산
			HourlyEmployee hourlyEmployee = new HourlyEmployee();

			System.out.print("이름을 입력하세요 : ");
			name = stringInput.nextLine();
			hourlyEmployee.setName(name);

			System.out.print("시급를 입력하세요 : ");
			hourlyWage = numberInput.nextInt();
			hourlyEmployee.setHourlyWage(hourlyWage);

			System.out.print("일한 시간을 입력하세요 : ");
			workTime = numberInput.nextInt();
			hourlyEmployee.setWorkTime(workTime);
			
			System.out.println(hourlyEmployee.toString());
			
			
		}
		stringInput.close();
		numberInput.close();
	}

}
