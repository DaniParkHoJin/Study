package view;

import java.util.Scanner;

public class MenuViewer {
	public static Scanner choice = new Scanner(System.in);
	// ���� �޴�
	public static void mainMenuView() {
		System.out.println();
		System.out.println("�̷����б� ������û ���α׷�");
		System.out.println("�ش� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. �а� ���� ���/�Է�/����/����");
		System.out.println("2. �л� ���� �Է�/����/���");
		System.out.println("3. ���� ���� ���/�Է�/����/����");
		System.out.println("4. ���� ��û ���/��û/���");
		System.out.println("5. ���α׷� ����");
		System.out.println();
		System.out.print("��ȣ ���� : ");
		
	}
	// �а� �޴�
	public static void sujectMenuView() {
		System.out.println();
		System.out.println("�а� ���� �޴� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. �а� ���� ���");
		System.out.println("2. �а� ���� �Է�");
		System.out.println("3. �а� ���� ����");
		System.out.println("4. �а� ���� ����");
		System.out.println("5. ���� �޴�");
		System.out.println();
		System.out.print("��ȣ ���� : ");
		
	}
	// �л� �޴�
	public static void studnetMenuView() {
		System.out.println();
		System.out.println("�л� ���� �޴� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ����");
		System.out.println("3. �л� ��ü ���");
		System.out.println("4. ���� �޴�");
		System.out.println();
		System.out.print("��ȣ ���� : ");
	}
	// ���� �޴�
	public static void lessonMenuView() {
		System.out.println();
		System.out.println("���� ���� �޴� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. ���� ���� ���");
		System.out.println("2. ���� ���� �Է�");
		System.out.println("3. ���� ���� ����");
		System.out.println("4. ���� ��ü ����");
		System.out.println("5. ���� �޴�");
		System.out.println();
		System.out.print("��ȣ ���� : ");
	}
	// ���� ��û �޴�
		public static void traineeMenuView() {
			System.out.println();
			System.out.println("���� ���� �޴� ��ȣ�� �Է��ϼ���.");
			System.out.println("1. ���� ��û ���");
			System.out.println("2. ���� ��û");
			System.out.println("3. ���� ���");
			System.out.println("4. ���� �޴�");
			System.out.println();
			System.out.print("��ȣ ���� : ");
		}

}
