import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) throws InterruptedException {
		Random random = new Random();

		Set<Integer> lotto = new TreeSet<>(); // �ζǹ�ȣ
		// HashSet<Integer> lotto = new HashSet<>();

		int bonus; // ���ʽ� ��ȣ
		System.out.println("�ζ� ��ȣ ������");
		for (int i = 1; i < 7; i++) {
			System.out.println(i + "��° ��ȣ ����");
			if (!lotto.add(random.nextInt(45) + 1)) {
				i = i - 1;
			}
			Thread.sleep(1000);
		}
		System.out.println("\n�ζ� ��ȣ");
		System.out.println(lotto.toString());

		do {
			bonus = random.nextInt(45) + 1;
			if (!(lotto.contains(bonus))) {
				break;
			}

		} while (true);
		System.out.println("\n���ʽ� ��ȣ");
		System.out.println(bonus);

	}

}
