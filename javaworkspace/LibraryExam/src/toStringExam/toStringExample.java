package toStringExam;

public class toStringExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("�Ｚ����", "�ȵ���̵�");
		
		String string1 = myPhone.toString();
		System.out.println(string1);
		
		System.out.println(myPhone);
	}

}
