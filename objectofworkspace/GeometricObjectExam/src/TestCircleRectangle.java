
public class TestCircleRectangle {

	public static void main(String[] args) {
		
		Circle circle = new Circle(1);
		System.out.println("원 : " + circle.toString());
		System.out.println("반지름 : " + circle.getRadius());
		System.out.println("면적 : " + circle.getArea());
		System.out.println("둘레 : " + circle.getDiameter());
		
		Rectangle rectangle = new Rectangle(2,4);
		System.out.println("\n사각형 : " + rectangle.toString());
		System.out.println("면적 : " + rectangle.getArea());
		System.out.println("둘레 : " + rectangle.getperimeter());
		
	}

}
