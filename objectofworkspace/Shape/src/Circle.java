
public class Circle {
	
	private Point centerPoint;
	private double radius;
	
	
	// 기본생성자
	public Circle() {
		super();
	}
	
	// 모두 받는 생성자
	public Circle(Point centerPoint, double radius) {
		super();
		this.centerPoint = centerPoint;
		this.radius = radius;
	}
	// getter 좌표를 받는
	public Point getCenterPoint() {
		return centerPoint;
	}
	// getter 반지름을 받는
	public double getRadius() {
		return radius;
	}
	// setter 중심점을 설정하는
	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}
	// 	setter 반지름을 설정하는
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [centerPoint=" + centerPoint + ", radius=" + radius + "]";
	}
	
	
	
	
	
	
	
	
}
