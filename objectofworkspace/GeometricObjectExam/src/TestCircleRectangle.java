
public class TestCircleRectangle {

	public static void main(String[] args) {
		
		Circle circle = new Circle(1);
		System.out.println("�� : " + circle.toString());
		System.out.println("������ : " + circle.getRadius());
		System.out.println("���� : " + circle.getArea());
		System.out.println("�ѷ� : " + circle.getDiameter());
		
		Rectangle rectangle = new Rectangle(2,4);
		System.out.println("\n�簢�� : " + rectangle.toString());
		System.out.println("���� : " + rectangle.getArea());
		System.out.println("�ѷ� : " + rectangle.getperimeter());
		
	}

}
