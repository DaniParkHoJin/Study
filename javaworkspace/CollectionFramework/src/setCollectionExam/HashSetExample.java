package setCollectionExam;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// HasSet �÷��� ����
		Set<String> set = new HashSet<String>();
		
		// ��ü ����
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // �ߺ� ��ü�̹Ƿ� �������� ����
		set.add("Spring");
		set.add("Java");	// �ߺ� ��ü �̹Ƿ� �������� ����
		set.add("Spring");	// �ߺ� ��ü �̹Ƿ� �������� ����
		
		
		// ����� ��ü �� ���
		
		int size = set.size();
		System.out.println("�� ��ü ��: " + size);
		
	}

}
