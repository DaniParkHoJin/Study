package controller;

import java.util.Scanner;

import model.SubjectVo;

public class SubjectRegisterManager {
	// �а� ���
	public void subjectList() {
		SubjectDAO sd = new SubjectDAO();
		System.out.println("�а� ��ü ����Ʈ");
		sd.getSubjectTotalList();
		System.out.println();
	}
	// �а� ���
	public void subjectInsert() {
		Scanner input = new Scanner(System.in);
		
		SubjectDAO sd = new SubjectDAO();
		SubjectVo svo = new SubjectVo();
		
		String s_num; // �а���ȣ
		String s_name; // �а��̸�
		
		System.out.println("�а� ��ü ����Ʈ");
		sd.getSubjectTotalList();
		System.out.println();
		
		System.out.println("�а� ���� �Է�");
		System.out.print("�а���ȣ : ");
		s_num = input.nextLine();
		System.out.print("�а��� : ");
		s_name = input.nextLine();
		
		svo.setS_num(s_num);
		svo.setS_name(s_name);
		
		sd.getSubjectRegiste(svo);
		
		System.out.println();
		System.out.println("�а� ��ü ����Ʈ");
		sd.getSubjectTotalList();
		System.out.println();
		
	}

}
