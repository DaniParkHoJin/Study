
public class Box {
	
	private double height; // 높이
	private double width;	// 너비(가로)
	private double headth;	// 폭(세로)
	private boolean empty;	// 상태 - 비어있는가? 채워져 있는가?
	// 기본 생성자
	public Box() {
		super();
	}
	// 모든 데이터를 받는 생성자	
	public Box(double height, double width, double headth, boolean empty) {
		super();
		this.height = height;
		this.width = width;
		this.headth = headth;
		this.empty = empty;
	}
	//	높이 getter
	public double getHeight() {
		return height;
	}
	// 너비 getter
	public double getWidth() {
		return width;
	}
	// 폭 getter
	public double getHeadth() {
		return headth;
	}
	// 상태 getter
	public boolean isEmpty() {
		return empty;
	}
	// 높이 setter
	public void setHeight(double height) {
		this.height = height;
	}
	// 너비 setter
	public void setWidth(double width) {
		this.width = width;
	}
	// 폭 setter
	public void setHeadth(double headth) {
		this.headth = headth;
	}
	// 상태 setter
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", headth=" + headth + ", empty=" + empty + "]";
	}
	
	
	
	
	
	
	
}
