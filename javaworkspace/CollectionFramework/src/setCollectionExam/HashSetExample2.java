package setCollectionExam;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		// HashSet �÷��� ����
		Set<Member> set = new HashSet<>();

		Member member1 = new Member();
		member1.setAge(30);
		member1.setName("ȫ�浿");
		System.out.printf("%d\n", member1.hashCode());

		set.add(member1);

		Member member2 = new Member();
		member2.setAge(30);
		member2.setName("ȫ�浿");
		System.out.printf("%d\n", member2.hashCode());

		set.add(member2);
		// ������ ��ü �� ���
		System.out.println("�� ��ü �� : " + set.size());
	}

}
