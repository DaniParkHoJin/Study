package hashcodeExam;

public class HashCodeExample {

	public static void main(String[] args) {
		Student student1 = new Student(1, "ȫ�浿");
		Student student2 = new Student(1, "ȫ�浿");
		
		if (student1.hashCode() == student2.hashCode()) {
			if (student1.equals(student2)) {
				System.out.println("���� ��ü�Դϴ�.");
			} else {
				System.out.println("�����Ͱ� �ٸ��Ƿ� ���� ��ü�� �ٸ��ϴ�.");
			}
		} else {
			System.out.println("�ؽ��ڵ尡 �ٸ��Ƿ� ���� ��ü�� �ƴմϴ�.");
		}
	}

}
