
public class SmartTV extends TV implements RemoteControl {

	private boolean internet; // 인터넷
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("스마트 Tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 Tv를 끕니다.");

	}

//	@Override
//	public void setVolume(int volume) {
//		if (volume > RemoteControl.MAX_VOLUME) {
//			this.volume = RemoteControl.MAX_VOLUME;
//		} else if (volume < RemoteControl.MIN_VOLUME) {
//			this.volume = RemoteControl.MIN_VOLUME;
//		} this.volume = volume;
//		System.out.println("현재 TV 볼륨 : " + this.volume);
//	}

}
