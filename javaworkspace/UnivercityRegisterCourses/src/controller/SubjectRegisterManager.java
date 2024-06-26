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
	// �а� ��� ����
	public void subjectInsert() throws Exception{
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
	// �а� ���� ����
	public void subjectUpdate() throws Exception { 
		Scanner inputNumber = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		SubjectDAO sd = new SubjectDAO();
		SubjectVo svo = new SubjectVo();
		
		int s_no; // �Է��� �Ϸù�ȣ
		String s_num; // �а� ��ȣ
		String s_name; // �а���
		
		System.out.println("�а� ��ü ����Ʈ");
		sd.getSubjectTotalList();
		System.out.println();
		
		System.out.println("������ �а� �Ϸù�ȣ �Է�");
		System.out.println("�Ϸù�ȣ : ");
		s_no = inputNumber.nextInt();
		
		System.out.println();
		System.out.println("���ο� ���� ��� �Է�");
		
		System.out.print("�а���ȣ : ");
		s_num = inputString.nextLine();
		
		System.out.print("�а��� : ");
		s_name = inputString.nextLine();
		
		svo.setNo(s_no);
		svo.setS_num(s_num);
		svo.setS_name(s_name);
		
		sd.setSubjectUpdate(svo);
		
		System.out.println();
		System.out.println("�а� ��ü ����Ʈ");
		sd.getSubjectTotalList();
		System.out.println();
		
		
	}
	// �а� ���� ����
	public void subjectDelete() throws Exception {
		Scanner input = new Scanner(System.in);
		
		SubjectDAO sd = new SubjectDAO();
		SubjectVo svo = new SubjectVo();
		
		int s_no; // �Է��� �Ϸù�ȣ
		
		System.out.println("�а� ��ü ����Ʈ");
		sd.getSubjectTotalList();
		System.out.println();
		
		System.out.println("������ �Ϸù�ȣ �Է�");
		System.out.print("�Ϸù�ȣ : ");
		s_no = input.nextInt();
		
		sd.setSubjectDelete(s_no);
		
		System.out.println();
		System.out.println("�а� ��ü ����Ʈ");
		sd.getSubjectTotalList();
		System.out.println();
		
	}

}
