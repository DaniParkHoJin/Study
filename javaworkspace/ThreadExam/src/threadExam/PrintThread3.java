package threadExam;

public class PrintThread3 extends Thread{

	@Override
	public void run() {
		while (true) {
			System.out.println("���� ��");
			if (Thread.interrupted()) {
				break;
			}
		}
		System.out.println("���ҽ� ����");
		System.out.println("���� ����");
	}

}
