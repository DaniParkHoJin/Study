
public class SmartTV extends TV implements RemoteControl {

	private boolean internet; // ���ͳ�
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("����Ʈ Tv�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ Tv�� ���ϴ�.");

	}

//	@Override
//	public void setVolume(int volume) {
//		if (volume > RemoteControl.MAX_VOLUME) {
//			this.volume = RemoteControl.MAX_VOLUME;
//		} else if (volume < RemoteControl.MIN_VOLUME) {
//			this.volume = RemoteControl.MIN_VOLUME;
//		} this.volume = volume;
//		System.out.println("���� TV ���� : " + this.volume);
//	}

}
