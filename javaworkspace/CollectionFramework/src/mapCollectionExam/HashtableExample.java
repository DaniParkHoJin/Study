package mapCollectionExam;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		// Hashtable �÷��� ����
		Map<String, Integer> map = new Hashtable<String, Integer>();
		//Map<String, Integer> map = new HashMap<String, Integer>(); HashMap���� �ϸ� ������ �̻�����.
		// �۾� ������ ��ü ����
		Thread threadA = new Thread() {
			// ��Ʈ�� 1000�� �߰�
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}

		};

		// �۾� ������ ��ü ����
		Thread threadB = new Thread() {
			// ��Ʈ�� 1000�� �߰�
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}

		};

		// �۾� ������ ����
		threadA.start();
		threadB.start();

		// �۾� ��������� ��� ����� �� ���� ���� �����带 ��ٸ��� ��
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
		// ����� �� ���帮 �� ���
		int size = map.size();
		System.out.println("�� ��Ʈ�� ��: " + size);
		System.out.println();
	}

}
