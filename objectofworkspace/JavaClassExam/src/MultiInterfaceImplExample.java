
public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// RemoteControl �������̽� ���� ���� �� ���� ��ü ����
		RemoteControl remoteControl = new SmartTelevision();
		// RemoteControl �������̽��� ����� �ʻ� �޼ҵ常 ȣ�� ����
		remoteControl.turnOn();
		remoteControl.turnOff();
		// Searchable �������̽� ���� ���� �� ���� ��ü ����
		Searchable searchable = new SmartTelevision();
		// Searchable �������̽� ����� �߻� �޼ҵ常 ȣ�� ����
		searchable.search("https://www.youtube.com");
	}

}
