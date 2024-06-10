import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) throws InterruptedException {
		Random random = new Random();

		Set<Integer> lotto = new TreeSet<>(); // 로또번호
		// HashSet<Integer> lotto = new HashSet<>();

		int bonus; // 보너스 번호
		System.out.println("로또 번호 생성기");
		for (int i = 1; i < 7; i++) {
			System.out.println(i + "번째 번호 생성");
			if (!lotto.add(random.nextInt(45) + 1)) {
				i = i - 1;
			}
			Thread.sleep(1000);
		}
		System.out.println("\n로또 번호");
		System.out.println(lotto.toString());

		do {
			bonus = random.nextInt(45) + 1;
			if (!(lotto.contains(bonus))) {
				break;
			}

		} while (true);
		System.out.println("\n보너스 번호");
		System.out.println(bonus);

	}

}
