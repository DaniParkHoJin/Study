
public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
 System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	// search() �߻� �޼ҵ� �������̵�
	@Override
	public void search(String url) {
		 System.out.println(url + "�� �˻��մϴ�.");
	}
	
	
	

}
