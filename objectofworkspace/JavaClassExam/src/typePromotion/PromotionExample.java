package typePromotion;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ü ����
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// �������̽� ���� ����
		A a;
		
		// ������ ���� ��ü ����
		
		a = b; // A <- B �ڵ� Ÿ�� ��ȯ
		a = c; // A <- C �ڵ� Ÿ�� ��ȯ
		a = d; // A <- D �ڵ� Ÿ�� ��ȯ
		a = e; // A <- E �ڵ� Ÿ�� ��ȯ
	}

}
