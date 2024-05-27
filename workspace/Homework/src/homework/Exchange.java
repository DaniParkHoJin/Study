package homework;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {

		// 입력받기 위한 스캐너 객체 생성
		Scanner input = new Scanner(System.in);

		// 변수 선언
		int Won; // 입력받은 원화
		double Dollar; // 환전 후 달러
		double ExchangeRate; // 환율

		// 환율을 입력 받기 위한 프롬프터
		System.out.print("환율을 입력하시오 : ");

		// 환율을 입력받는다.
		ExchangeRate = input.nextInt();

		
		// 원화를 입력 받기 위한 프롬프터
		System.out.print("원화 금액을 입력하시오 : ");

		// 원화를 입력받는다.
		Won = input.nextInt();

		
		// 환율계산
		// Won / ExchangeRate
		Dollar = (double)Won / ExchangeRate; 
		
		// 출력
		System.out.println("원화는 " + (double)Won + " 은 " + Dollar + " 달러 입니다.");
		
		// 스캐너 종료
		input.close();
	}

}
