package pdf0523;

import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {
		
		// 사용자로부터 입력을 받기 위해 Scanner를 생성한다.
		Scanner input = new Scanner(System.in);
		
		int number; 	// 난수를 위한 변수
		int guess; 		// 추측을 위한 변수 입력값을 받는 변수
		int count;		// 추측 횟수 측정을 위한 변수
		
		number = (int)(Math.random()*101);
		
		System.out.println("숫자 맞추기 게임");
		
		count = 0;
		
		while (true) {

			System.out.print("0에서 100 사이의 숫자를 입력하세요. : ");
			guess = input.nextInt();
			
			count++;// 추측 시도 횟수 증가
			
			if (guess == number) {
				System.out.println(guess + " 맞습니다. "+ count + "번 만에 맞추셨습니다.");
				break;
			} else if (guess>number) {
				System.out.println("Down! 낮은 숫자를 입력하세요.");			
			} else {
				System.out.println("Up! 높은 숫자를 입력하세요.");
			}
	
		}
		input.close();
	}

}
