package regexExam;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		String regexExample;
		String data;
		boolean result;

		regexExample = "(02|010)-\\d{3,4}-\\d{4}";
		data = "010-123-4567";

		result = Pattern.matches(regexExample, data);

		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

		regexExample = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result = Pattern.matches(regexExample, data);

		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

	}
	// �޴���ȭ��ȣ ���Խ� Ȯ�� �޼ҵ�

	public void phonePatter(String inputPhoneNumber) {
		// ���� ����
		String regexPhoneNumber;//  �ι�° ������ 4�ڸ��� 010-XXXX-XXXX
		String regexPhoneNumber1;// �߰� ������ 3�ڸ��� 017, 018 ����ڴ� 01X-XXX-XXXX
		String regexPhoneNumber2;// �߰� ������ 3,4 �ڸ� ȥ��

		String phoneNumber;
		boolean result;
		
		phoneNumber = inputPhoneNumber;
		regexPhoneNumber = "(010)-\\d{4}-\\d{4}";
		regexPhoneNumber1 = "(017|018)-\\d{3}-\\d{4}";
		regexPhoneNumber2 = "(010|016|019)-\\d{3,4}-\\d{4}";

		
		result = Pattern.matches(regexPhoneNumber, phoneNumber);
		
		if (result) {
			System.out.println("�ùٸ� �޴���ȭ��ȣ �Դϴ�.");
		} else {
			System.out.println("�߸��� �޴���ȭ��ȣ �Դϴ�. �ٽ� �Է��ϼ���.");
		}
	}
}
