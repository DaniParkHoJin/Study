package stackQueueCollection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// Stack �÷��� ����
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// ���� �ֱ�
		coinBox.add(new Coin(100));
		coinBox.add(new Coin(50));
		coinBox.add(new Coin(500));
		coinBox.add(new Coin(10));

		// ������ �ϳ��� ������

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}
		
	}

}
