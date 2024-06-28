package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.StudentVo;
	
public class StudentRegisterManager {
	// �л� ���� ���
	public void studentRegistr() throws Exception {
		Scanner input = new Scanner(System.in);

		SubjectDAO sdao = new SubjectDAO();
		StudentDAO sd = new StudentDAO();
		StudentVo svo = new StudentVo();

		String sd_num; // �й�
		String sd_name; // �̸�
		String sd_id; // ���̵�
		String sd_password; // ��й�ȣ
		String s_num; // �а� ��ȣ
		String sd_birthday;// �������
		String sd_phone;// ��ȭ��ȣ
		String sd_address; // �ּ�
		String sd_email; // �̸���

		boolean id_check; // ���̵� üũ
		String year; // �⵵

		System.out.println("�л� ���� �Է�");
		System.out.print("���� : ");
		sd_name = input.nextLine();
		do {
			System.out.print("���̵�(8�� �̻� 12�� �̳�) : ");
			sd_id = input.nextLine();
			id_check = sd.getStudentIdOverlap(sd_id);
			if (id_check) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է��ϼ���.");
			}
		} while (id_check);

		System.out.print("��й�ȣ(12�� �̳�) : ");
		sd_password = input.nextLine();
		sdao.getSubjectTotalList();// �Ҽ� �а��� �˷��־���� �й� ������ �� �� �ִ�.

		System.out.print("�Ҽ� �а� ��ȣ�� �������� : ");
		s_num = input.nextLine();

		// �л� ��ȣ�� 8�ڸ��� �����Ѵ�.
		// ����2�ڸ� + �а� 2�ڸ� + �Ϸù�ȣ
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		year = sdf.format(new Date());
		sd_num = year + s_num + sd.getStudentCount(s_num);

		System.out.print("�������(8�ڸ�) : ");
		sd_birthday = input.nextLine();

		System.out.print("��ȭ��ȣ : ");
		sd_phone = input.nextLine();

		System.out.print("���θ� �ּ� : ");
		sd_address = input.nextLine();

		System.out.print("�̸��� : ");
		sd_email = input.nextLine();

		svo.setSd_num(sd_num);
		svo.setSd_name(sd_name);
		svo.setSd_id(sd_id);
		svo.setSd_password(sd_password);
		svo.setS_num(s_num);
		svo.setSd_birthday(sd_birthday);
		svo.setSd_phone(sd_phone);
		svo.setSd_address(sd_address);
		svo.setSd_email(sd_email);

		sd.setStudentResiste(svo);

		System.out.println();
		System.out.println("��� �л� ����");
		sd.getStudent(svo.getSd_id(), svo.getSd_password());
		System.out.println();

	}

	// �л� ���� ����
	public void studentUpdate() throws Exception{
		Scanner inputNumber = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);

		StudentDAO sdao = new StudentDAO();
		StudentVo svo = new StudentVo();

		String id; // ���̵�
		String pw; // �Է� ��й�ȣ
		String sd_num; // �й�
		String sd_password; // ���� ��й�ȣ
		String sd_phone; // ���� ��ȭ��ȣ
		String sd_address; // ���� �ּ�
		String sd_email; // ���� �̸���

		boolean success = false;

		System.out.println("�л� ���� ����");

		do {
			System.out.print("���̵� : ");
			id = inputString.nextLine();
			System.out.print("��й�ȣ : ");
			pw = inputString.nextLine();
			success = sdao.getStudentLogin(id, pw);

			if (!success) {
				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�. �ٽ� �Է��ϼ���.");

			}
		} while (!success);
		sd_num = sdao.getStudentNum(id,pw);
		
		System.out.println();
		System.out.println("������ �л�");
		System.out.println("�л���ȣ : " + sd_num);
		
		System.out.print("��й�ȣ(12�� �̳�) : ");
		sd_password = inputString.nextLine();
		
		System.out.print("��ȭ��ȣ : ");
		sd_phone = inputString.nextLine();
		
		System.out.print("���θ� �ּ� : ");
		sd_address = inputString.nextLine();
		
		System.out.print("�̸��� : ");
		sd_email = inputString.nextLine();
		
		svo.setSd_num(sd_num);
		svo.setSd_password(sd_password);
		svo.setSd_phone(sd_phone);
		svo.setSd_address(sd_address);
		svo.setSd_email(sd_email);
		
		sdao.setStudentUpdate(svo);
		System.out.println("�л� ���� ���� ���");
		sdao.getStudent(id, svo.getSd_password());
		System.out.println();
		
		
	}
	// �л� ��ü ���
	public void studentList() throws Exception{
		
		Scanner input = new Scanner(System.in);
		
		StudentDAO sdao = new StudentDAO();

		String pw;
		
		System.out.println("�л� ���� ��ü ���");
		System.out.print("������ ��й�ȣ : ");		
		pw = input.nextLine();
		
		if (pw.equals("admin1234")) {
			sdao.getStudentTotalList();
		} else {
			System.out.println("������ ��й�ȣ�� Ʋ���ϴ�.");
		}
		
	}

}
