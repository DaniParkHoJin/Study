package pdf0523;

import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {
		
		// ����ڷκ��� �Է��� �ޱ� ���� Scanner�� �����Ѵ�.
		Scanner input = new Scanner(System.in);
		
		int number; 	// ������ ���� ����
		int guess; 		// ������ ���� ���� �Է°��� �޴� ����
		int count;		// ���� Ƚ�� ������ ���� ����
		
		number = (int)(Math.random()*101);
		
		System.out.println("���� ���߱� ����");
		
		count = 0;
		
		while (true) {

			System.out.print("0���� 100 ������ ���ڸ� �Է��ϼ���. : ");
			guess = input.nextInt();
			
			count++;// ���� �õ� Ƚ�� ����
			
			if (guess == number) {
				System.out.println(guess + " �½��ϴ�. "+ count + "�� ���� ���߼̽��ϴ�.");
				break;
			} else if (guess>number) {
				System.out.println("Down! ���� ���ڸ� �Է��ϼ���.");			
			} else {
				System.out.println("Up! ���� ���ڸ� �Է��ϼ���.");
			}
	
		}
		input.close();
	}

}
