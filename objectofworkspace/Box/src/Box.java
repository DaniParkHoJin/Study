
public class Box {
	
	private double height; // ����
	private double width;	// �ʺ�(����)
	private double headth;	// ��(����)
	private boolean empty;	// ���� - ����ִ°�? ä���� �ִ°�?
	// �⺻ ������
	public Box() {
		super();
	}
	// ��� �����͸� �޴� ������	
	public Box(double height, double width, double headth, boolean empty) {
		super();
		this.height = height;
		this.width = width;
		this.headth = headth;
		this.empty = empty;
	}
	//	���� getter
	public double getHeight() {
		return height;
	}
	// �ʺ� getter
	public double getWidth() {
		return width;
	}
	// �� getter
	public double getHeadth() {
		return headth;
	}
	// ���� getter
	public boolean isEmpty() {
		return empty;
	}
	// ���� setter
	public void setHeight(double height) {
		this.height = height;
	}
	// �ʺ� setter
	public void setWidth(double width) {
		this.width = width;
	}
	// �� setter
	public void setHeadth(double headth) {
		this.headth = headth;
	}
	// ���� setter
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", headth=" + headth + ", empty=" + empty + "]";
	}
	
	
	
	
	
	
	
}
