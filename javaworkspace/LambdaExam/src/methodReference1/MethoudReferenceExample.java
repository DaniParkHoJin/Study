package methodReference1;

public class MethoudReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();

		// ���� �޼ҵ��� ���
		// ���ٽ�
		// Person.action((x,y)-> Computet.staticMethod(x,y));
		// �޼ҵ� ����
		person.action(Computer::staticMethod);
		
		// �ν��Ͻ� �޼ҵ��� ���
		Computer com = new Computer();
		// ���ٽ�
		//person.action((x,y)-> com.instanceMethod(x, y));
		// �޼ҵ� ����
		person.action(com::instanceMethod);
	}

}
