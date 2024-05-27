package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		
		// 사용자로부터 입력을 받기 위한 스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// while문 의 조건식을 위한 변수 선언
		boolean run;
		
		run = true;
		
		int speed;
		
		speed = 0;
		
		while (run) {
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도 = " + speed);
							
			} else if (strNum.equals("2")){
				speed--;
				System.out.println("현재속도 = " + speed);
				
			} else if(strNum.equals("3")) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
		scanner.close();
	}

}
