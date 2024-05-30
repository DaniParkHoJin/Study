
public class Circle extends GeometricObject {

	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPermeter() {
		return 2 * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public void printCircle() {
		System.out.println("원 도형의 생성일 : " + getDateCreated() + "\n원의 반지름 : " + radius);
	};

}
