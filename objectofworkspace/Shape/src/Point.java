
public class Point {

	private double pointX;
	private double pointY;

	// ±âº» »ý¼ºÀÚ
	public Point() {
		super();
	}

	// µÎ °¡Áö¸¦ ¸ðµÎ ¹Þ´Â »ý¼ºÀÚ
	public Point(double pointX, double pointY) {
		super();
		this.pointX = pointX;
		this.pointY = pointY;
	}

	// getter x ÁÂÇ¥
	public double getPointX() {
		return pointX;
	}

	// getter y ÁÂÇ¥
	public double getPointY() {
		return pointY;
	}

	// setter x ÁÂÇ¥
	public void setPointX(double pointX) {
		this.pointX = pointX;
	}

	// setter y ÁÂÇ¥
	public void setPointY(double pointY) {
		this.pointY = pointY;
	}

	@Override
	public String toString() {
		return "Point [pointX=" + pointX + ", pointY=" + pointY + "]";
	}

}
