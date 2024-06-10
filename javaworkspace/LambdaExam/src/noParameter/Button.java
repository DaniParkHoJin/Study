package noParameter;

public class Button {
	// ���� ��� �������̽�
	
	public static interface ClickListener{
		// �߻� �޼ҵ�
		void onClick();
	}
	
	// �ʵ�
	private ClickListener clickListener;

	// �޼ҵ�
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
	
}
