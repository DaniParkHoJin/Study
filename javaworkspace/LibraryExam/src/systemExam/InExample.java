package systemExam;
import java.io.IOException;

public class InExample {

	public static void main(String[] args) {

		int speed;
		int keyCode;

		speed = 0;
		keyCode = 0;

		while (true) {
			if (keyCode != 13 && keyCode != 10) {
				if (keyCode == 49) {
					speed++;
				} else if (keyCode == 50) {
					speed--;
				} else if (keyCode == 51) {
					break;
				}
				System.out.println("--------------------------");
				System.out.println("1. ���� \t2.���� \t3. ����");
				System.out.println("--------------------------");
				System.out.println("���� �ӵ� = " + speed);
				System.out.print("���� : ");
			}

			try {
				keyCode = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("���α׷� ����");
	}
}
