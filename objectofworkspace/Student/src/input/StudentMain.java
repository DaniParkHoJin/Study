package input;

import java.util.Scanner;

public class StudentMain {
	// 메인 안에서 사용하기 위해 static 으로 스캐너 객체 생성
	static Scanner input = new Scanner(System.in);
	static Student[] info; // 학생 정보 객체 배열
	static int studentCount; // 학생수
	static boolean isAdded; // 입력 자료 추가 확인

	public static void main(String[] args) {
		int choice; // 메뉴 선택 번호
		Student inputData; // 입력 자료
		int inputLimit; // 입력 제한
		inputLimit = 0;
		isAdded = false; // 입력 자료 추가 확인(실패 : false)
		do {
			System.out.print("학생 인원수 입력(2~30) : ");
			studentCount = input.nextInt();
		} while (studentCount > 2 && studentCount <= 30);
		info = new Student[studentCount]; // 학생 객체 선언
		// 학생 객체 생성
		for (int i = 0; i < info.length; i++) {
			info[i] = new Student();
		}
		do {
			showMenu();
			choice = input.nextInt();
			input.nextLine(); // 문자열과 숫자 입력이 연속으로 되는 것을 방지
			switch (choice) {
			case 1:
				if (inputLimit < studentCount) {
					inputData = inputStudentInfo(); // 입력한 학생 정보
					info[inputLimit] = inputData; // 입력한 학생 정보를 추가
					System.out.println(info[inputLimit].toString());
					if (isAdded == true) {
						++inputLimit;
						System.out.println(inputLimit + "번째 학생 데이터입력이 완료되었습니다. \n");
					} else {
						System.out.println("데이터가 저장되지 않았습니다.. \n");
					}
					break;
				} else {
					System.out.println("입력한 학생수를 초과 했습니다.");
					break;
				}
			case 2:

				searchData(); // 학생 검색
				break;
			case 3:
				deleteData(); // 학생 삭제
				break;
			case 4:
				System.out.println("학생 전체 목록");
				for (Student outData : info) {
					System.out.println(outData);
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하여 프로그램을 종료합니다.");
				return;
			}
		} while (true);
	}

	// 메뉴
	public static void showMenu() {
		System.out.println("학생 정보 등록 프로그램");
		System.out.println("선택하세요...");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 이름으로 검색");
		System.out.println("3. 학생 이름으로 삭제");
		System.out.println("4. 전체 학생 목록");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택: ");
	}

	// 학생정보 입력
	public static Student inputStudentInfo() {
		String name; // 이름
		String addr; // 주소
		String tel; // 전화
		String grade; // 학년
		Student student; // 학생 객체 생성
		System.out.print("이름 : ");
		name = input.nextLine();
		System.out.print("주소 : ");
		addr = input.nextLine();
		System.out.print("전화번호 : ");
		tel = input.nextLine();
		System.out.print("학년 : ");
		grade = input.nextLine();
		student = new Student(name, addr, tel, grade);
		if (student != null) {
			isAdded = true;
			return student;
		}
		return null;
	}

	// 학생 검색 시작
	public static void searchData() {
		String searchName; // 검색할 이름
		Student info; // 검색한 학생 정보
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("학생 이름 : ");
		searchName = input.nextLine();
		// 학생 이름으로 검색
		info = search(searchName);
		if (info == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			System.out.println("검색된 학생 정보");
			info.showStudentInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}

	// 학생 이름으로 검색
	public static Student search(String name) {
		// 학생 목록의 요소에 대한 학생객체(정보)를 검색.
		for (int i = 0; i < studentCount; i++) {
			if (info[i].getName().equals(name)) {
				return info[i];
			}
		}
		return null;
	}

	// 학생이름으로 삭제
	public static void deleteData() {
		String deleteName; // 삭제할 이름
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.print("학생 이름 : ");
		deleteName = input.nextLine();
		// 학생 목록의 요소에 대한 학생객체(정보)를 적절한 순서로 반환.
		for (int i = 0; i < studentCount; i++) {
			if (info[i].getName().equals(deleteName)) {
				info[i] = null;
				System.out.println("데이터 삭제가 완료되었습니다. \n");
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
	}

}
