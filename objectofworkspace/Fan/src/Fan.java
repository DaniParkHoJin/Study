
public class Fan {
	private Speed speed; //속도
	private boolean on;	// 동작여부
	private double radius;	// 선풍기 지름
	private String color;	// 색상
	
	// 기본 생성자
	public Fan() {
		this(Speed.SLOW, false, 5.0, "Red");
	}
	// 모든 매개 변수를 받는 생성자
	public Fan(Speed speed, boolean on, double radius, String color) {
		super();
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	// 속도 접근자
	public Speed getSpeed() {
		return speed;
	}
	// 동작여부 접근자
	public boolean isOn() {
		return on;
	}
	// 지름 접근자
	public double getRadius() {
		return radius;
	}
	// 색상 접근자
	public String getColor() {
		return color;
	}
	// 설정자
	// 속도 설정자
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
	// 동작여부 설정자
	public void setOn(boolean on) {
		this.on = on;
	}
	// 지름 설정자
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// 색상 설정자
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		String koreanSpeed;
		
		if (this.speed == Speed.FAST) {
			koreanSpeed = "최고 속도";
		} else if(this.speed == Speed.MEDIUM) {
			koreanSpeed = "중간 속도";
		} else {
			koreanSpeed = "최저 속도";
		}
		
		
		return "Fan [speed=" + koreanSpeed + ", on=" + (on ? "켜져있다." : "꺼져있다.") + ", radius=" + radius + ", color=" + color + "]";
	}
	
	
	
	
	

	
	
}
