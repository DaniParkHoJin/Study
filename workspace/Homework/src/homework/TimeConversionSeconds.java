package homework;

import java.util.Scanner;

public class TimeConversionSeconds {

	public static void main(String[] args) {

		// 입력 받기 위한 스캐너 객체 생성
		Scanner input = new Scanner(System.in);

		// 필요한 변수 선언
		int hour; // 시간을 입력받을 변수
		int minute; // 분을 입력받을 변수
		int second; // 초를 입력받을 변수
		int sum; // 누적산을 할 변수

		// 프로그램 명을 출력한다.
		System.out.println("시간(시, 분, 초)을 초로 환산하는 프로그램");

		// 사용자로부터 시를 입력받는다.
		System.out.print("시를 입력하세요. : ");
		hour = input.nextInt();

		// 입력받은 시를 초로 환산하고 누적산한다.
		// 시간 * 60(분) * 60(초)
		sum = hour * 60 * 60;

		// 사용자로부터 분을 입력받는다.
		System.out.print("분를 입력하세요. : ");
		minute = input.nextInt();

		// 입력받은 분을 초로 환산한고 누적산한다.
		// 분 * 60(초)
		sum += minute * 60;

		// 사용자로부터 초를 입력받는다.
		System.out.print("초를 입력하세요. : ");
		second = input.nextInt();
		
		// 입력받은 초를 누적한 한다.
		sum += second;
		
		// 누적산 초를 출력한다.
		System.out.println(hour + "시간 " + minute + "분 " + second + "초는 " + sum + "초이다.");
		
		input.close();		
	}

}
