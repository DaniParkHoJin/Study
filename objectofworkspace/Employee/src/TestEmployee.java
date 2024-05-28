import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {

		// 1. 입력받기 위한 스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);
		// 2. 프로그램 이름 출력
		System.out.println("---------- 삼성 신입 직원 입력 프로그램 ----------");
		// 3. Employee 객체 생성
		Employee samsungNewEmployee = new Employee();
		// 4. set으로 정보를 입력한다.
		// 4.1. setName로 이름을 입력한다.
		System.out.print("신입 직원의 이름을 입력하세요 : ");
		samsungNewEmployee.setName(scanner.nextLine());
		// 4.2. setTel로 전화번호를 입력받는다.
		System.out.print(samsungNewEmployee.getName() + "의 휴대폰 번호를 - 없이 입력하세요 : ");
		do {
			String inputTelNumber; // 휴대폰 번호를 임시로 받을 변수
			inputTelNumber = scanner.nextLine();
			// 휴대폰 번호 자릿 수 검증
			if (inputTelNumber.length() == 11) {
				samsungNewEmployee.setTel(inputTelNumber);
				break; // 11자리가 맞으면 do, while문 탈출
			} else {
				System.out.print("잘못 입력하셨습니다. " + samsungNewEmployee.getName() + "의 휴대폰 번호를 -없이 입력하세요 : ");
			}
		} while (true);

		// 4.3. setSal로 연봉을 만원 단위로 입력받는다.
		System.out.print(samsungNewEmployee.getName() + "의 연봉을 만원 단위로 입력하세요 : ");

		do {
			int inputSal;
			inputSal = scanner.nextInt();

			if (inputSal > 0) {
				samsungNewEmployee.setSal(inputSal);
				break;
			} else {
				System.out
						.print("잘못된 연봉을 입력하셨습니다. 연봉은 만원 단위로 1만원부터입니다." + samsungNewEmployee.getName() + "의 연봉을 입력하세요.");
			}

		} while (true);

		// 5. 입력된 정보를 다양하게 출력한다.
		// 5.1. 객체 안의 매서드를 이용한 방법.
		samsungNewEmployee.printEmployee();
		// 5.2. main에서 객체 필드별 값을 getter로 받아와 출력하는 방법.
		System.out.println(samsungNewEmployee.getName() + "의 전화번호는 " + samsungNewEmployee.getTel() + "이고, 연봉은 "
				+ samsungNewEmployee.getSal() + "만원입니다.");

		// 6. 스캐너 객체 종료.
		scanner.close();
	}

}
