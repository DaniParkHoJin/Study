package TreeSetTreeMapExam;

import java.util.TreeSet;

public class CmparableExample {

	public static void main(String[] args) {
		//TreeSet �÷��� ����
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// ��ü ����
		Person person1 = new Person();
		person1.setName("ȫ�浿");		
		person1.setAge(45);
		
		Person person2 = new Person();
		person2.setName("���ڹ�");		
		person2.setAge(25);

		Person person3 = new Person();
		person3.setName("������");		
		person3.setAge(31);
		
		
		// ��ü�� �ϳ��� ��������
			System.out.println(person1.getName() + ":"+ person1.getAge());
			System.out.println(person2.getName() + ":"+ person2.getAge());
			System.out.println(person3.getName() + ":"+ person3.getAge());


	}

}
