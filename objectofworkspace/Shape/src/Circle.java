
public class Circle {
	
	private Point centerPoint;
	private double radius;
	
	
	// �⺻������
	public Circle() {
		super();
	}
	
	// ��� �޴� ������
	public Circle(Point centerPoint, double radius) {
		super();
		this.centerPoint = centerPoint;
		this.radius = radius;
	}
	// getter ��ǥ�� �޴�
	public Point getCenterPoint() {
		return centerPoint;
	}
	// getter �������� �޴�
	public double getRadius() {
		return radius;
	}
	// setter �߽����� �����ϴ�
	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}
	// 	setter �������� �����ϴ�
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [centerPoint=" + centerPoint + ", radius=" + radius + "]";
	}
	
	
	
	
	
	
	
	
}
