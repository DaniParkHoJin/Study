package remoteControl;

public class Home {
	// �ʵ忡 �͸� ���� ��ü ����

	private RemoteControl remoteControl = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	// �޼ҵ� (�ʵ� ���)
	public void use1() {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	
	// �޼ҵ� (���� ������ �͸� ���� ��ü ����)
	public void use2() {
		RemoteControl remoteControl = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("�������� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("�������� ���ϴ�.");				
			}
		};
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	// �޼��� (�Ű����� �̿�)
	public void use3(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	
	
}
