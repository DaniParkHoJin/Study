
public interface RemoteControl {
//	// ��� �ʵ�
//	int MAX_VOLUME = 10;
//	int MIN_VOLUME = 0;

	// �߻� �޼���
	void turnOn();

	void turnOff();
//
//	void setVolume(int volume);
//
//	// ����Ʈ �޼���
//	default void setMute(boolean mute) {
//		if (mute) {
//			System.out.println("���� ó���մϴ�.");
//			// �߻� �޼ҵ� ȣ���ϸ鼭 ��� �ʵ� ���
//			setVolume(MIN_VOLUME);
//		} else {
//			System.out.println("���� �����մϴ�.");
//		}
//	}
//
//	static void changeBattery() {
//		System.out.println("������ �������� ��ȯ�մϴ�.");
//	}

}
