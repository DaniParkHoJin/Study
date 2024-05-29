
public class Square {
	private Point vertex; // 꼭지점, 좌표
	private double width;	// 가로
	private double vertical;	// 세로
	
	// 기본 생성자
	public Square() {
		super();
	}
	
	// 모든 것을 포함하는 생성자
	public Square(Point vertex, double width, double vertical) {
		super();
		this.vertex = vertex;
		this.width = width;
		this.vertical = vertical;
	}
	// 꼭지점 접속자
	public Point getVertex() {
		return vertex;
	}
	// 가로 접속자
	public double getWidth() {
		return width;
	}
	// 세로 접속자
	public double getVertical() {
		return vertical;
	}
	// 꼭지점 설정자
	public void setVertex(Point vertex) {
		this.vertex = vertex;
	}
	// 가로 접속자
	public void setWidth(double width) {
		this.width = width;
	}
	// 세로 접속자
	public void setVertical(double vertical) {
		this.vertical = vertical;
	}

	@Override
	public String toString() {
		return "Square [vertex=" + vertex + ", width=" + width + ", vertical=" + vertical + "]";
	}
	
	
	
	

	
	
	
	
	
}
