
public class CellPhone {

	// �ʵ� ����
	private String modelName; // �𵨸�
	private String company; // ������
	private String color; // ����
	private boolean power; // ���� �⺻ ���´� false ��
	private boolean camera; // ī�޶� ���� �⺻�� true

	// �⺻ ������
	public CellPhone() {
		super();
	}

	// �ñ״�ó�� ��� ����ϴ� ������
	public CellPhone(String modelName, String company, String color, boolean power, boolean camera) {
		super();
		this.modelName = modelName;
		this.company = company;
		this.color = color;
		this.power = power;
		this.camera = camera;
	}

	// �𵨸� getter
	public String getModelName() {
		return modelName;
	}

	// ����ȸ�� getter
	public String getCompany() {
		return company;
	}

	// ���� getter
	public String getColor() {
		return color;
	}

	// ���� getter
	public boolean isPower() {
		return power;
	}

	// ī�޶� getter
	public boolean isCamera() {
		return camera;
	}

	// �𵨸� setter
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	// ����ȸ�� setter
	public void setCompany(String company) {
		this.company = company;
	}

	// ���� setter
	public void setColor(String color) {
		this.color = color;
	}

	// ���� setter
	public void setPower(boolean power) {
		this.power = power;
	}

	// ī�޶� setter
	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	// ���� �� �޼���
	public void turnOn() {
		System.out.println("������ �������ϴ�.");
	}
	// ���� �� �޼���
	public void turnOff() {
		System.out.println("������ �����ֽ��ϴ�.");
	}



	@Override
	public String toString() {
		return "CellPhone [modelName=" + modelName + ", company=" + company + ", color=" + color + ", power=" + power
				+ ", camera=" + camera + "]";
	}

}
