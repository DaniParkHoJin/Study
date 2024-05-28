import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		// scanner 객체 생성
		Scanner scanner = new Scanner(System.in);

		// Rectangle 객체 인스턴스화
		Rectangle whiteBoard = new Rectangle();

		// 프로그램 이름 프롬프터
		System.out.println("화이트 보드 넓이 계산 프로그램");

		// 가로 길이를 입력받는다.
		System.out.print("가로의 길이를 입력하세요 : ");
		whiteBoard.setWidth(scanner.nextInt());

		// 세로 길이를 입력받는다.
		System.out.print("세로의 길이를 입력하세요 : ");
		whiteBoard.setLength(scanner.nextInt());

		// rec1 객체의 calcArea를 불러 출력한다.
		// calArea()를 이용해 출력
		System.out.println("입력하신 화이트 보드의 넓이는 : " + whiteBoard.calcArea() + "입니다.");
		// calArea(int width, int length)를 이용해 출력
		System.out.println(
				"입력하신 화이트 보드의 넓이는 : " + whiteBoard.calcArea(whiteBoard.getWidth(), whiteBoard.getLength()) + "입니다.");

		// 출력문 안에서 계산
		System.out.println("입력하신 화이트 보드의 넓이는 : " + whiteBoard.getWidth() * whiteBoard.getLength() + "입니다.");

		scanner.close();

	}

}
