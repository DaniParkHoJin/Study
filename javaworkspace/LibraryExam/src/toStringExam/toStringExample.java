package toStringExam;

public class toStringExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		String string1 = myPhone.toString();
		System.out.println(string1);
		
		System.out.println(myPhone);
	}

}
