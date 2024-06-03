
public class RemoteControlExam {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl remoteControl;
		
		remoteControl = new SmartTV();
		remoteControl.turnOn();
//		remoteControl.setVolume(5);
		
		// 디폴트 메소드 호출
//		remoteControl.setMute(true);
//		remoteControl.setMute(false);

		System.out.println();

		// Audio 객체를 생성하고 인터페이스 변수에 대입
		remoteControl = new Audio();
		remoteControl.turnOn();
//		remoteControl.setVolume(5);
		
		// 디폴드 매소드 호출
//		remoteControl.setMute(true);
	//	remoteControl.setMute(false);
	
		System.out.println();
		
		// 정적 매소드 호출
	//	RemoteControl.changeBattery();
	}
	
	

}
