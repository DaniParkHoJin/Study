package controller;

import java.util.Scanner;

import model.TraineeVO;

public class TraineeRegisterManager {

	// ���� ��û ����
	public void traineeRegistr() throws Exception {
		Scanner inputString = new Scanner(System.in);

		TraineeDAO td = new TraineeDAO();
		TraineeVO tvo = new TraineeVO();
		LessonDAO ld = new LessonDAO();
		StudentDAO sdao = new StudentDAO();

		String sd_num; // �й�
		String l_abbre; // ������
		String t_section; // ���񱸺�
		String id; // ���̵�
		String pw; // ��й�ȣ
		String mainMenu; // ���� �޴�

		boolean success = false;

		System.out.println("���� ���� ���� ��ü ����Ʈ");
		ld.getLessonTotalList();
		System.out.println();
		System.out.println("���� ��û�� ���� ���� �Է�");
		do {
			System.out.print("���̵� : ");
			id = inputString.nextLine();
			System.out.print("��й�ȣ : ");
			pw = inputString.nextLine();
			success = sdao.getStudentLogin(id, pw);
			if (!success) {
				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�� �ٽ� �Է��ϼ���.");
				System.out.print("���� �޴��� �̵�(y/n) : ");
				mainMenu = inputString.nextLine();
				if (mainMenu.equals("y") || mainMenu.equals("Y")) {
					return;
				}
				System.out.println();
			}
		} while (!success);

		sd_num = sdao.getStudentNum(id, pw);
		System.out.println("�й� : " + sd_num);

		System.out.print("������(���� �빮��) : ");
		l_abbre = inputString.nextLine();

		System.out.print("���񱸺�(����,����,������) : ");
		t_section = inputString.nextLine();
		tvo.setSd_num(sd_num);
		tvo.setL_abbre(l_abbre);
		tvo.setT_section(t_section);

		// ���� ��û ���
		td.setTraineeRegistr(tvo);
		System.out.println();
		System.out.println("���� ��û�� ����Ʈ");
		td.getTraineeTotalList(sd_num);
		System.out.println();
		inputString.close();
		
	}

	// ���� ��û ����Ʈ
	public void traineeList() throws Exception {
		Scanner inputString = new Scanner(System.in);

		String sd_num; // �й�
		String id; // ���̵�
		String password; // ��й�ȣ
		String mainMenu; // ���� �޴�

		boolean success = false;

		TraineeDAO td = new TraineeDAO();
		StudentDAO sdao = new StudentDAO();
		System.out.println("���� ��û�� ���");

		do {
			System.out.print("���̵� : ");
			id = inputString.nextLine();
			System.out.print("��й�ȣ : ");

			password = inputString.nextLine();
			success = sdao.getStudentLogin(id, password);
			if (!success) {
				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�� �ٽ� �Է��ϼ���.");
				System.out.print("���� �޴��� �̵�(y/n) : ");
				mainMenu = inputString.nextLine();
				if (mainMenu.equals("y") || mainMenu.equals("Y")) {
					return;
				}
				System.out.println();
			}
		} while (!success);
		sd_num = sdao.getStudentNum(id, password);
		System.out.println();
		System.out.println("���� ��û�� ����Ʈ");
		td.getTraineeTotalList(sd_num);
		System.out.println();
		inputString.close();
		
	}

	// ���� ��û ��� ����
	public void traineeDelete() throws Exception {

		Scanner inputNumber = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		TraineeDAO td = new TraineeDAO();
		StudentDAO sdao = new StudentDAO();
		
		String sd_num; // �й�
		int t_no; // ���� ��ȣ
		String id; // ���̵�
		String passwrod; // ��й�ȣ
		String mainMenu; // ���� �޴�
		boolean success = false;
		
		System.out.println("���� ����� ���� ������ �Է��ϼ���.");
		do {
			System.out.print("���̵� : ");
			id = inputString.nextLine();
			System.out.print("��й�ȣ : ");
			passwrod = inputString.nextLine();
			success = sdao.getStudentLogin(id, passwrod);
			if (!success) {
				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�� �ٽ� �Է��ϼ���.");
				System.out.print("���� �޴��� �̵�(y/n) : ");
				mainMenu = inputString.nextLine();
				if (mainMenu.equals("y") || mainMenu.equals("Y")) {
					return;
				}
				System.out.println();
			}
		} while (!success);
		
		sd_num = sdao.getStudentNum(id, passwrod);
		System.out.println();
		
		System.out.println("���� ��û�� ����Ʈ");
		td.getTraineeTotalList(sd_num);
		System.out.println();
		
		System.out.println("����� ���� ��û �Ϸù�ȣ �Է�");
		System.out.print("�Ϸù�ȣ : ");		
		t_no = inputNumber.nextInt();
		
		td.setTraineeDelete(t_no);
		System.out.println();
		
		System.out.println("���� ��û ��� �� ����Ʈ");
		td.getTraineeTotalList(sd_num);
		System.out.println();
	}

}
