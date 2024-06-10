package setCollectionExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {

	public static void main(String[] args) {
		// HashSet �÷��� ����
		Set<String> set = new HashSet<String>();

		// ��ü �߰�
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");

		// ��ü�� �ϳ��� �����ͼ� ó��
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			if (element.equals("JSP")) {
				// ������ ��ü�� �÷��ǿ��� ����
				iterator.remove();
			}

		}
		System.out.println();
		
		// ��ü ����
		set.remove("JDBC");
		// ��ü�� �ϳ��� �����ͼ� ó��
		 for (String element : set) {
			 System.out.println(element);
			
		}

		
	}
	
	
}
