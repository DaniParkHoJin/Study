
public class RemoteControlExam {

	public static void main(String[] args) {
		// �������̽� ���� ����
		RemoteControl remoteControl;
		
		remoteControl = new SmartTV();
		remoteControl.turnOn();
//		remoteControl.setVolume(5);
		
		// ����Ʈ �޼ҵ� ȣ��
//		remoteControl.setMute(true);
//		remoteControl.setMute(false);

		System.out.println();

		// Audio ��ü�� �����ϰ� �������̽� ������ ����
		remoteControl = new Audio();
		remoteControl.turnOn();
//		remoteControl.setVolume(5);
		
		// ������ �żҵ� ȣ��
//		remoteControl.setMute(true);
	//	remoteControl.setMute(false);
	
		System.out.println();
		
		// ���� �żҵ� ȣ��
	//	RemoteControl.changeBattery();
	}
	
	

}
