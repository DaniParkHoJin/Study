package listCollectionExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	// board ��ü�� �ٲٰ� vector���� �ݺ��� ������ �ͼ� ��ü ���� ���� ���� �÷����� Linkedlist�� �� ��������.
	// ������ �ý��� ȯ�� �����̴�.
	public static void main(String[] args) {
		// ArrayList �÷��� ��ü ����
		List<String> list1 = new ArrayList<>();

		// LinkedList �÷��� ��ü ����
		List<String> list2 = new LinkedList<>();

		// ���� �ð��� �� �ð��� ������ ���� ����
		long startTime;
		long endTime;

		// ArrayList �÷��ǿ� �����ϴ� �ð� ����
		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList �ɸ� �ð�: ", (endTime - startTime));

		// LinkedList �÷��ǿ� �����ϴ� �ð� ����
		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList �ɸ� �ð�: ", (endTime - startTime));

	}

}
