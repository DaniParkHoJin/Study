package pdf0523;

import java.util.Scanner;

public class StudentArrayInput {

	public static void main(String[] args) {

		// 국어 성적 입력받기 위한 스캐너 객체 생성
		Scanner input = new Scanner(System.in);

		final int STUDENTS = 10; // 학생수
		int total; // 학생들의 총점
		total = 0;
		int avg; // 학생들의 평균
		avg = 0;

		// 프로그램 이름
		System.out.println("과목 성적 계산 프로그램");

		// 과목 배열 객체 생성 STUDENTS로 인원제한
		int[] scores = new int[STUDENTS];

		// 점수 입력을 위한 반복문
		for (int i = 0; i < STUDENTS; i++) {
			System.out.print((i + 1) + "번 학생의 성적을 입력하세요. : ");
			scores[i] = input.nextInt();
		}
		// 줄개행
		System.out.println();
		
		// 입력받은 점수의 합계
		for (int i = 0; i < STUDENTS; i++) {
			total += scores[i];
		}
		// 평균
		avg = total / STUDENTS;
		
		// 합계, 평균을 출력한다.		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		input.close();
	}

}
