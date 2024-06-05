package regexExam;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		String regexExample;
		String data;
		boolean result;

		regexExample = "(02|010)-\\d{3,4}-\\d{4}";
		data = "010-123-4567";

		result = Pattern.matches(regexExample, data);

		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

		regexExample = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result = Pattern.matches(regexExample, data);

		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}
	// 휴대전화번호 정규식 확인 메소드

	public void phonePatter(String inputPhoneNumber) {
		// 변수 선언
		String regexPhoneNumber;//  두번째 국번이 4자리만 010-XXXX-XXXX
		String regexPhoneNumber1;// 중간 국번이 3자리만 017, 018 사용자는 01X-XXX-XXXX
		String regexPhoneNumber2;// 중간 국번이 3,4 자리 혼용

		String phoneNumber;
		boolean result;
		
		phoneNumber = inputPhoneNumber;
		regexPhoneNumber = "(010)-\\d{4}-\\d{4}";
		regexPhoneNumber1 = "(017|018)-\\d{3}-\\d{4}";
		regexPhoneNumber2 = "(010|016|019)-\\d{3,4}-\\d{4}";

		
		result = Pattern.matches(regexPhoneNumber, phoneNumber);
		
		if (result) {
			System.out.println("올바른 휴대전화번호 입니다.");
		} else {
			System.out.println("잘못된 휴대전화번호 입니다. 다시 입력하세요.");
		}
	}
}
