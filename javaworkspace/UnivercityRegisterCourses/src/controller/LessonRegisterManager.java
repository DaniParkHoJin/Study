package controller;

import java.util.Scanner;

import model.LessonVo;

public class LessonRegisterManager {
	// ���� ���
	public void lessonList() throws Exception {
		LessonDAO ld = new LessonDAO();
		System.out.println("���� ��ü ����Ʈ");
		ld.getLessonTotalList();
		System.out.println();
	}

	public void lessonRegistr() throws Exception {
		Scanner input = new Scanner(System.in);
		LessonDAO ld = new LessonDAO();
		LessonVo lvo = new LessonVo();
		
		String l_abbre; // ������
		String l_name; // �����
		
		System.out.println("���� ��ü ����Ʈ");
		ld.getLessonTotalList();
		System.out.println();
		
		System.out.println("���� ���� �Է�");
		System.out.print("���� ��� : ");
		l_abbre = input.nextLine();
		
		System.out.print("����� : ");
		l_name = input.nextLine();
		
		lvo.setL_abbre(l_abbre);
		lvo.setL_name(l_name);
		
		ld.setLessonRegiste(lvo);
		System.out.println();
		
		System.out.println("���� ��ü ����Ʈ");
		ld.getLessonTotalList();
		System.out.println();
		input.close();
		
	}
	// ���� ���� ����
	public void lessonUpdate() throws Exception {
		Scanner inputNumber = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		LessonDAO ld = new LessonDAO();
		LessonVo lvo = new LessonVo();
		
		int l_no; // ������ ���� �Ϸù�ȣ
		String l_abbre; // ������ ���� ���
		String l_name; // ������ �����
		
		System.out.println("���� ��ü ����Ʈ(������� ���� ���� �Ұ�)");
		ld.getLessonTotalList();
		System.out.println();
		
		System.out.println("������ ���� �Ϸù�ȣ �Է�");
		System.out.print("�Ϸù�ȣ ���� : ");
		l_no = inputNumber.nextInt();
		
		System.out.println("���ο� ���� ��� �Է�");
		System.out.print("������ : ");
		l_abbre = inputString.nextLine();
		
		System.out.print("����� : ");
		l_name = inputString.nextLine();
		
		lvo.setNo(l_no);
		lvo.setL_abbre(l_abbre);
		lvo.setL_name(l_name);
		
		ld.setLessonUpdate(lvo);
		System.out.println("���� ��ü ����Ʈ");
		ld.getLessonTotalList();
		System.out.println();
		inputNumber.close();
		inputString.close();
		
	}
	// ���� ���� ����
	public void lessonDelete() throws Exception {
		Scanner input = new Scanner(System.in);
		
		LessonDAO ld = new LessonDAO();
		
		int l_no; // ������ ���� ��ȣ
		
		System.out.println("���� ��ü ����Ʈ(������� ���� ��� �Ұ�)");
		ld.getLessonTotalList();
		System.out.println();
		
		System.out.println("������ ���� �Ϸù�ȣ �Է�");
		System.out.print("�Ϸù�ȣ : ");
		l_no = input.nextInt();
		
		ld.setLessonDelete(l_no);
		
		System.out.println();
		System.out.println("�а� ��ü ����Ʈ");
		ld.getLessonTotalList();
		System.out.println();
		input.close();
		
	}

}
