package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn;
		ssn = "880815-1234567";
		
		String firstNum;
		firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum;
		secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		
	}

}
