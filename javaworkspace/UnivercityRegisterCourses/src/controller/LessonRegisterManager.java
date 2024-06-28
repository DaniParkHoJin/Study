package controller;

import java.util.Scanner;

import model.LessonVo;

public class LessonRegisterManager {
	// 과목 목록
	public void lessonList() throws Exception {
		LessonDAO ld = new LessonDAO();
		System.out.println("과목 전체 리스트");
		ld.getLessonTotalList();
		System.out.println();
	}

	public void lessonRegistr() throws Exception {
		Scanner input = new Scanner(System.in);
		LessonDAO ld = new LessonDAO();
		LessonVo lvo = new LessonVo();
		
		String l_abbre; // 과목약어
		String l_name; // 과목명
		
		System.out.println("과목 전체 리스트");
		ld.getLessonTotalList();
		System.out.println();
		
		System.out.println("과목 정보 입력");
		System.out.print("과목 약어 : ");
		l_abbre = input.nextLine();
		
		System.out.print("과목명 : ");
		l_name = input.nextLine();
		
		lvo.setL_abbre(l_abbre);
		lvo.setL_name(l_name);
		
		ld.setLessonRegiste(lvo);
		System.out.println();
		
		System.out.println("과목 전체 리스트");
		ld.getLessonTotalList();
		System.out.println();
		input.close();
		
	}
	// 과목 수정 관리
	public void lessonUpdate() throws Exception {
		Scanner inputNumber = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		LessonDAO ld = new LessonDAO();
		LessonVo lvo = new LessonVo();
		
		int l_no; // 수정할 과목 일련번호
		String l_abbre; // 수정할 과목 약어
		String l_name; // 수정할 과목명
		
		System.out.println("과목 전체 리스트(사용중인 과목 변경 불가)");
		ld.getLessonTotalList();
		System.out.println();
		
		System.out.println("수정할 과목 일련번호 입력");
		System.out.print("일련번호 선택 : ");
		l_no = inputNumber.nextInt();
		
		System.out.println("새로운 정보 모두 입력");
		System.out.print("과목약어 : ");
		l_abbre = inputString.nextLine();
		
		System.out.print("과목명 : ");
		l_name = inputString.nextLine();
		
		lvo.setNo(l_no);
		lvo.setL_abbre(l_abbre);
		lvo.setL_name(l_name);
		
		ld.setLessonUpdate(lvo);
		System.out.println("과목 전체 리스트");
		ld.getLessonTotalList();
		System.out.println();
		inputNumber.close();
		inputString.close();
		
	}
	// 과목 삭제 관리
	public void lessonDelete() throws Exception {
		Scanner input = new Scanner(System.in);
		
		LessonDAO ld = new LessonDAO();
		
		int l_no; // 삭제할 과목 번호
		
		System.out.println("과목 전체 리스트(사용중인 과목 사용 불가)");
		ld.getLessonTotalList();
		System.out.println();
		
		System.out.println("삭제할 과목 일련번호 입력");
		System.out.print("일련번호 : ");
		l_no = input.nextInt();
		
		ld.setLessonDelete(l_no);
		
		System.out.println();
		System.out.println("학과 전체 리스트");
		ld.getLessonTotalList();
		System.out.println();
		input.close();
		
	}

}
