package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		String oldStr;
		String newStr;
		
		oldStr = "�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.";
		newStr = oldStr.replace("�ڹ�", "JAVA");
				
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
