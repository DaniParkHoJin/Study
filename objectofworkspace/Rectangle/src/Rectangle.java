
public class Rectangle {
	private int width; // ����
	private int length; // ����

	// �⺻ ������
	public Rectangle() {
		super();
	}

	// �ʵ� ��θ� �޴� ������
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	// ������ ����
	public int getWidth() {
		return width;
	}

	// ������ ����
	public int getLength() {
		return length;
	}

	// ������ ����
	public void setWidth(int width) {
		this.width = width;
	}

	// ������ ����
	public void setLength(int length) {
		this.length = length;
	}

	// Rectangle ���̸� ���ϴ� ����
	// ���� * ����, �ʵ��� Ÿ���� int�̹Ƿ� ��ȯ�� int�� �Ѵ�.
	public int calcArea() {
		int area; // ���̸� ���� ���� ����

		area = this.width * this.length;

		return area;
	}

	// �Ű������� �޴� �޼���
	public int calcArea(int width, int length) {

		int area;// ���̸� ���� ���� ����
		
		this.width = width;
		this.length = length;

		return area = this.width * this.length;

	}

	@Override
	public String toString() {
		return "Rectange [width=" + width + ", length=" + length + "]";
	}

}
