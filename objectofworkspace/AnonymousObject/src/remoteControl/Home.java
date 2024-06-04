package remoteControl;

public class Home {
	// 필드에 익명 구현 객체 대입

	private RemoteControl remoteControl = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	// 메소드 (필드 사용)
	public void use1() {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	
	// 메소드 (로컬 변수에 익명 구현 객체 대입)
	public void use2() {
		RemoteControl remoteControl = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");				
			}
		};
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	// 메서드 (매개변수 이용)
	public void use3(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	
	
}
