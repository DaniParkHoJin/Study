
public class InstansofExample {
	//main() �޼ҵ忡�� �ٷ� ȣ���ϱ� ���� ���� �޼ҵ� ����
	public static void personInfo(Person person){
		System.out.println("name: " + person.getName());
		person.walk();
		
		//person�� �����ϴ� ��ü�� sutdent Ÿ������ Ȯ��
		//if (person instanceof Student) {
		//	// Student ��ü�� ��� ���� Ÿ�� ��ȯ
		//	Student student = (Student) person;
		//	// Student ��ü�� ������ �ִ� �ʵ� �� �޼ҵ� ���
		//	System.out.println("studentsNo: " + student.getStudentNo());
		//	student.study();
		//}
		// person�� �����ϴ� ��ü�� Student Ÿ���� ���
		// student ������ ����(Ÿ�� ��ȯ �߻�)
		if (person instanceof Student student) {
			System.out.println("studentNo : "+ student.getStudentNo());
			student.study();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// Person ��ü�� �Ű������� �����ϰ� personInfo() �޼ҵ� ȣ��
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		personInfo(p1);
		
		System.out.println();
		
		// Student ��ü�� �Ű������� �����ϰ� personInfo() �޼ҵ� ȣ��
		Person p2 = new Student();
		p2.setName("��浿");
		personInfo(p2);
	}
}
