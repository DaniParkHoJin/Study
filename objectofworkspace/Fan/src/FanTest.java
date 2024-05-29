import java.util.Scanner;

public class FanTest {

	public static void main(String[] args) {
		// 1. 입력받기 위한 스캐너 객체 생성
		Scanner stringInput = new Scanner(System.in); // 문자를 입력받기 위한 스캐너 객체
		Scanner numberInput = new Scanner(System.in); // 숫자를 입력받기 위한 스캐너 객체
		// 2. 프로그램 이름 출력 프롬프터
		System.out.println("선풍기 정보 출력 프로그램");
		System.out.println();

		System.out.print("몇 대의 선풍기를 가지고 있습니까? ");
		int number; // 선풍기 댓수를 받는 변수
		number = numberInput.nextInt();
		// 입력받는 댓수로 반복
		for (int i = 0; i < number; i++) {
			// 3. 객체 생성
			Fan myFan = new Fan();
			// 4. 현재속도를 입력받는다
			System.out.print((i+1) + "번째 선풍기 단수를 1(저속), 2(중속),3(고속) 중에 입력하세요 : ");
			int nowFanSpeed;// 현재 속도를 입력받기 위한 변수 선언
			nowFanSpeed = numberInput.nextInt();
			switch (nowFanSpeed) {
			case 1:
				myFan.setSpeed(Speed.SLOW);
				break;
			case 2:
				myFan.setSpeed(Speed.MEDIUM);
				break;
			case 3:
				myFan.setSpeed(Speed.FAST);
			default:
				break;
			}
			// 5. 동작여부를 입력받는다.
			System.out.print("현재 선풍기가 동작 중이면 '1'을 정지상태면 '0'을 입력하세요 : ");
			int fanOn; // 동작상태를 받기 위한 변수 선언
			fanOn = numberInput.nextInt();

			if (fanOn == 1) {
				myFan.setOn(true);
			} else {
				myFan.setOn(false);
			}
			// 6. 지름을 입력받는다.
			System.out.print((i+1) + "번째 선풍기의 지름을 입력하세요 : ");
			myFan.setRadius(numberInput.nextInt());

			// 7. 색상을 입력받는다.
			System.out.print((i+1) + "번째 선풍기의 색상을 입력하세요 : ");
			myFan.setColor(stringInput.nextLine());

			// 8. 출력한다.
			System.out.println(myFan.toString());
		}

		// 9. 스캐너 객체를 닫는다.
		stringInput.close();
		numberInput.close();
	}

}
