import java.util.Date;

public class GeometricObject {

	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
		color = "white";
		filled = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "도형 생성일 : " + dateCreated + "\ncolor : " + color + "\nfilled : "+ filled;
	}
	
	
	
}
