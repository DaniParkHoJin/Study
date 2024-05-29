import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// 1. 좌표를 입력받는 스캐너 객체 생성
		Scanner pointInput = new Scanner(System.in);

		// 2. 프로그램 프롬프터
		System.out.println("좌표를 입력받아 도형을 그리는 프로그램");
		System.out.println();
		
		// 3. 좌표를 입력받는 point 객체 생성
		Point point = new Point();

		// 4. x 좌표를 입력받는다.
		System.out.print("x 좌표를 입력하세요 : ");
		point.setPointX(pointInput.nextDouble());

		// 5. y 좌표를 입력받는다.
		System.out.print("y 좌표를 입력하세요 : ");
		point.setPointY(pointInput.nextDouble());
		
		
	}

}
