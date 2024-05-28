
public class Rectangle {
	private int width; // 가로
	private int length; // 세로

	// 기본 생성자
	public Rectangle() {
		super();
	}

	// 필드 모두를 받는 생성자
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	// 접근자 가로
	public int getWidth() {
		return width;
	}

	// 접근자 세로
	public int getLength() {
		return length;
	}

	// 설정자 가로
	public void setWidth(int width) {
		this.width = width;
	}

	// 설정자 세로
	public void setLength(int length) {
		this.length = length;
	}

	// Rectangle 넓이를 구하는 공식
	// 가로 * 세로, 필드의 타입이 int이므로 반환도 int로 한다.
	public int calcArea() {
		int area; // 넓이를 담을 변수 선언

		area = this.width * this.length;

		return area;
	}

	// 매개변수를 받는 메서드
	public int calcArea(int width, int length) {

		int area;// 넓이를 담을 변수 선언
		
		this.width = width;
		this.length = length;

		return area = this.width * this.length;

	}

	@Override
	public String toString() {
		return "Rectange [width=" + width + ", length=" + length + "]";
	}

}
