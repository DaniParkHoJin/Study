import java.util.Scanner;

public class CellPhoneTest {

	public static void main(String[] args) {

//		1. 입력받기 위한 스캐너 객체 생성
//		2. cellphone 객체 생성
//		3. 프로그램 이름 출력
//		4. 모델명 입력받는다.
//		5. 제조회사를 입력받는다.
//		6. 색상을 입력받는다.
//		7. 전원 상태를 입력받는다.
//		8. 카메라 장착여부를 입력받는다.
//		9. 입력된 카메라 정보를 출력한다.
//		
		// 1. 입력받기 위한 스캐너 객체 생성
		Scanner scanner1 = new Scanner(System.in);// String 을 입력받기 위한 Scanner 객체
		Scanner scanner2 = new Scanner(System.in);// int 를 입력받기 위한 Scanner 객체
		// 2. cellPhone 객체 생성
		CellPhone workPlacePhone = new CellPhone();
//		3. 프로그램 이름 출력
		System.out.println("---------------리니지 작업장 핸드폰 상태 확인 프로그램---------------");
		System.out.println();
//		4. 모델명 입력받는다.
		System.out.print("핸드폰의 모델명을 입력하세요 : ");
		workPlacePhone.setModelName(scanner1.nextLine());

//		5. 제조회사를 입력받는다.
		System.out.print(workPlacePhone.getModelName() + " 의 제조회사를 입력하세요 : ");
		workPlacePhone.setCompany(scanner1.nextLine());

//		6. 색상을 입력받는다.
		System.out.print(workPlacePhone.getModelName() + " 의 색상을 입력하세요 : ");
		workPlacePhone.setColor(scanner1.nextLine());

//		7. 전원 상태를 확인한다. 추후 판별을 넣을 필요 있음.
		System.out.print(workPlacePhone.getModelName() + " 이 꺼져있으면 0, 켜져있으면 1을 입력하세요 : ");
		int onOff; // 전원상태를 입력받기 위한 변수
		onOff = scanner2.nextInt();
		if (onOff == 0) {
			workPlacePhone.setPower(false);;
		} else {
			workPlacePhone.setPower(true);
		}
//		8. 카메라 장착여부를 입력받는다. 추후 판별을 넣을 필요 있음.
		System.out.print(workPlacePhone.getModelName() + " 에 카메라가 없으면 0, 있으면 1을 입력하세요 : ");
		int existence;// 존재 여부를 입력받기 위한 변수
		existence = scanner2.nextInt();
		if (existence == 0) {
			workPlacePhone.setCamera(false);
		} else {
			workPlacePhone.setCamera(true);
			
		}
//		9. 입력된 모델의 정보를 출력한다.
		System.out.print("리니지 작업장의 " + workPlacePhone.getCompany() +" "+ workPlacePhone.getModelName() + " 의 색상은 " + workPlacePhone.getColor() +"이고 카메라가 " );
		if (workPlacePhone.isCamera() == true) {
			System.out.print("있으며 현재 ");
		} else {
			System.out.print("없으며 현재 ");
		}
		if (workPlacePhone.isPower() == true) {
			workPlacePhone.turnOn();
		} else {
			workPlacePhone.turnOff();
		}
		
		System.out.println(workPlacePhone.toString());

		
		scanner1.close();
		scanner2.close();
	}

}
