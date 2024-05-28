
public class CellPhone {

	// 필드 선언
	private String modelName; // 모델명
	private String company; // 제조사
	private String color; // 색상
	private boolean power; // 전원 기본 상태는 false 로
	private boolean camera; // 카메라 유무 기본은 true

	// 기본 생성자
	public CellPhone() {
		super();
	}

	// 시그니처를 모두 사용하는 생성자
	public CellPhone(String modelName, String company, String color, boolean power, boolean camera) {
		super();
		this.modelName = modelName;
		this.company = company;
		this.color = color;
		this.power = power;
		this.camera = camera;
	}

	// 모델명 getter
	public String getModelName() {
		return modelName;
	}

	// 제조회사 getter
	public String getCompany() {
		return company;
	}

	// 색상 getter
	public String getColor() {
		return color;
	}

	// 전원 getter
	public boolean isPower() {
		return power;
	}

	// 카메라 getter
	public boolean isCamera() {
		return camera;
	}

	// 모델명 setter
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	// 제조회사 setter
	public void setCompany(String company) {
		this.company = company;
	}

	// 색상 setter
	public void setColor(String color) {
		this.color = color;
	}

	// 전원 setter
	public void setPower(boolean power) {
		this.power = power;
	}

	// 카메라 setter
	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	// 전원 켬 메서드
	public void turnOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	// 전원 끔 메서드
	public void turnOff() {
		System.out.println("전원이 꺼져있습니다.");
	}



	@Override
	public String toString() {
		return "CellPhone [modelName=" + modelName + ", company=" + company + ", color=" + color + ", power=" + power
				+ ", camera=" + camera + "]";
	}

}
