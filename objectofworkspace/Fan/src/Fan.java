
public class Fan {
	private Speed speed; //�ӵ�
	private boolean on;	// ���ۿ���
	private double radius;	// ��ǳ�� ����
	private String color;	// ����
	
	// �⺻ ������
	public Fan() {
		this(Speed.SLOW, false, 5.0, "Red");
	}
	// ��� �Ű� ������ �޴� ������
	public Fan(Speed speed, boolean on, double radius, String color) {
		super();
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	// �ӵ� ������
	public Speed getSpeed() {
		return speed;
	}
	// ���ۿ��� ������
	public boolean isOn() {
		return on;
	}
	// ���� ������
	public double getRadius() {
		return radius;
	}
	// ���� ������
	public String getColor() {
		return color;
	}
	// ������
	// �ӵ� ������
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
	// ���ۿ��� ������
	public void setOn(boolean on) {
		this.on = on;
	}
	// ���� ������
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// ���� ������
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		String koreanSpeed;
		
		if (this.speed == Speed.FAST) {
			koreanSpeed = "�ְ� �ӵ�";
		} else if(this.speed == Speed.MEDIUM) {
			koreanSpeed = "�߰� �ӵ�";
		} else {
			koreanSpeed = "���� �ӵ�";
		}
		
		
		return "Fan [speed=" + koreanSpeed + ", on=" + (on ? "�����ִ�." : "�����ִ�.") + ", radius=" + radius + ", color=" + color + "]";
	}
	
	
	
	
	

	
	
}
