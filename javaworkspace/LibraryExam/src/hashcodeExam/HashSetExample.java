package hashcodeExam;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();

		Student student1 = new Student(1, "ȫ�浿");
		hashSet.add(student1);
		System.out.println("����� ��ü ��: " + hashSet.size());

		Student student2 = new Student(1, "ȫ�浿");
		hashSet.add(student2);
		System.out.println("����� ��ü ��: " + hashSet.size());
		
		Student student3 = new Student(2, "ȫ�浿");
		hashSet.add(student3);
		System.out.println("����� ��ü ��: " + hashSet.size());
	}

}
