package methodReference2;

public class Person {

	public void ordering(Comparable comparable) {
		String a;
		String b;
		
		a= "ȫ�浿";
		b = "��浿";
		
		int result = comparable.Compare(a, b);
		
		if (result < 0) {
			System.out.println(a + "�� " + b + "���� �տ� �ɴϴ�.");
		}else if (result == 0 ) {
			System.out.println(a + "�� " + b + "�� �����ϴ�.");
		} else {
			System.out.println(a + "�� " + b + "���� �ڿ� �ɴϴ�.");

		}
	}
}
