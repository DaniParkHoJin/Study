package listCollectionExam;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector �÷��� ����
		List<Board> list = new Vector<>(); // List<Board> list = new ArrayList<>(); �ε� �غ���

		// �۾� ������ ��ü ����
		Thread threadA = new Thread() {

			@Override
			public void run() {
				// ��ü 1000�� �߰�
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("����" + i, "����" + i, "�۾���" + i));

				}

			}

		};
		// �۾� ������ ��ü ����
		Thread threadB = new Thread() {

			@Override
			public void run() {
				// ��ü 1000�� �߰�
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board("����" + i, "����" + i, "�۾���" + i));

				}

			}

		};
		// �۾� ������ ����
		threadA.start();
		threadB.start();
		
		// �۾� ��������� ��� ����� ������ ���� �����带 ��ٸ��� ��
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {

		}
		
		// ����� �� ��ü �� ���
		int size = list.size();
		System.out.println("�� ��ü ��: " + size);
		System.out.println();
		
		
	}

}
