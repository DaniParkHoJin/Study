import java.util.Scanner;

public class BoxTest {

	public static void main(String[] args) {
		// 1. 입력받기 위한 스캐너 객체 생성
		// 2. Box 객체 생성
		// 3. 프로그램 이름 출력 프롬프터
		// 4. 높이를 입력받는다.
		// 5. 너비를 입력받는다.
		// 6. 폭을 입력받는다.
		// 7. 비어있는지 채워있는지 입력받는다.
		// 8. 프로그램만의 추가 프로그램을 넣는다.
		// 9. 프로그램 형식에 맞게 출력한다.

		// 1. 입력받기 위한 스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);

		// 2. Box 객체 생성
		Box swimmingPool = new Box();

		// 3. 프로그램 이름을 출력한다.
		System.out.println("---------- 수영장에 들어있는 물의 양을 구하는 프로그램 ----------");
		System.out.println();


		// 4. 너비(가로)를 입력받는다.
		System.out.print("수영장의 가로길이를 입력하세요 : ");
		swimmingPool.setWidth(scanner.nextDouble());

		// 5. 폭(세로)을 입력받는다.
		System.out.print("수영장의 세로길이를 입력하세요 : ");
		swimmingPool.setHeadth(scanner.nextDouble());

		// 6. 높이(깊이)를 입력받는다.
		System.out.print("수영장의 깊이를 입력하세요 : ");
		swimmingPool.setHeight(scanner.nextDouble());
		
		// 7. 비어있는지 채워있는지 입력받는다.
		System.out.print("수영장이 비어있으면 0, 채워져 있으면 1을 입력하세요 : ");
		
		int empty; // 상태 정보를 받기 위한 변수
		
		empty = scanner.nextInt();
		
		if (empty == 1) {
			swimmingPool.setEmpty(true);
		} else {
			swimmingPool.setEmpty(false);
		}
		// 8. 프로그램만의 추가 프로그램을 넣는다
		double volumePool; // 부피를 넣기 위한 변수
		double waterAmount;	// 물의 양을 넣기 위한 변수
		
		volumePool = swimmingPool.getWidth() * swimmingPool.getHeadth() * swimmingPool.getHeight();
		waterAmount = swimmingPool.getWidth() * swimmingPool.getHeadth() * swimmingPool.getHeight() * empty;
		// 기본 부피 공식에 상태에 따라서 물의 양을 출력한다.
		
		
		// 9. 프로그램 형식에 맞게 출력한다.
		System.out.println("당신의 수영장은 가로 " + swimmingPool.getWidth() + "M 이고, 세로 " + swimmingPool.getHeight() + "M 이며, 깊이 " + swimmingPool.getHeight() + "M 입니다.");
		System.out.println("그리고 당신의 수영에 물은 " + waterAmount + "L 입니다.");
		System.out.println(swimmingPool.toString());
		
		// 10. scanner 닫기
		scanner.close();
		
	}

}
