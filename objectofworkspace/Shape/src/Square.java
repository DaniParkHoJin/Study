
public class Square {
	private Point vertex; // ������, ��ǥ
	private double width;	// ����
	private double vertical;	// ����
	
	// �⺻ ������
	public Square() {
		super();
	}
	
	// ��� ���� �����ϴ� ������
	public Square(Point vertex, double width, double vertical) {
		super();
		this.vertex = vertex;
		this.width = width;
		this.vertical = vertical;
	}
	// ������ ������
	public Point getVertex() {
		return vertex;
	}
	// ���� ������
	public double getWidth() {
		return width;
	}
	// ���� ������
	public double getVertical() {
		return vertical;
	}
	// ������ ������
	public void setVertex(Point vertex) {
		this.vertex = vertex;
	}
	// ���� ������
	public void setWidth(double width) {
		this.width = width;
	}
	// ���� ������
	public void setVertical(double vertical) {
		this.vertical = vertical;
	}

	@Override
	public String toString() {
		return "Square [vertex=" + vertex + ", width=" + width + ", vertical=" + vertical + "]";
	}
	
	
	
	

	
	
	
	
	
}
