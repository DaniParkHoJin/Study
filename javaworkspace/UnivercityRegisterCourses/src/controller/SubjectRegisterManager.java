package controller;

import java.util.Scanner;

import model.SubjectVo;

public class SubjectRegisterManager {
	// 학과 목록
	public void subjectList() {
		SubjectDAO sd = new SubjectDAO();
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
	}
	// 학과 등록
	public void subjectInsert() {
		Scanner input = new Scanner(System.in);
		
		SubjectDAO sd = new SubjectDAO();
		SubjectVo svo = new SubjectVo();
		
		String s_num; // 학과번호
		String s_name; // 학과이름
		
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
		
		System.out.println("학과 정보 입력");
		System.out.print("학과번호 : ");
		s_num = input.nextLine();
		System.out.print("학과명 : ");
		s_name = input.nextLine();
		
		svo.setS_num(s_num);
		svo.setS_name(s_name);
		
		sd.getSubjectRegiste(svo);
		
		System.out.println();
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
		
	}

}
