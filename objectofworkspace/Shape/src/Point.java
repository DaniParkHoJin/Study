
public class Point {

	private double pointX;
	private double pointY;

	// �⺻ ������
	public Point() {
		super();
	}

	// �� ������ ��� �޴� ������
	public Point(double pointX, double pointY) {
		super();
		this.pointX = pointX;
		this.pointY = pointY;
	}

	// getter x ��ǥ
	public double getPointX() {
		return pointX;
	}

	// getter y ��ǥ
	public double getPointY() {
		return pointY;
	}

	// setter x ��ǥ
	public void setPointX(double pointX) {
		this.pointX = pointX;
	}

	// setter y ��ǥ
	public void setPointY(double pointY) {
		this.pointY = pointY;
	}

	@Override
	public String toString() {
		return "Point [pointX=" + pointX + ", pointY=" + pointY + "]";
	}

}
