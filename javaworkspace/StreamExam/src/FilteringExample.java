import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		// List �÷��� ����
		List<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("�ſ��");
		list.add("�Ź�ö");

		// �ߺ� ��� ����
		list.stream().distinct().forEach(name -> System.out.println(name));
		System.out.println();

		// ������ �����ϴ� ��Ҹ� ���͸�
		list.stream().filter(name -> name.startsWith("��")).forEach(name -> System.out.println(name));
		System.out.println();

		// �ߺ� ��Ҹ� ���� �����ϰ�, ������ �����ϴ� ��Ҹ� ���͸�
		list.stream().distinct().filter(name -> name.startsWith("��")).forEach(name -> System.out.println(name));
		System.out.println();

	}

}
